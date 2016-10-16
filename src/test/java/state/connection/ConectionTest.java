package state.connection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ConectionTest {
    private Connection connection;

    private LinkMock link;

    @Before
    public void ini() {
        this.link = new LinkMock();
        this.connection = new Connection(this.link);
    }

    @Test
    public void testStateEnumInicial() {
        assertEquals(StateEnum.CLOSED, this.connection.getEstado());
    }

    @Test
    public void testCerradoAbrir() {
        this.connection.abrir();
        assertEquals(StateEnum.PREPARED, this.connection.getEstado());
    }

    @Test
    public void testCerradoCerrar() {
        this.connection.cerrar();
        assertEquals(StateEnum.CLOSED, this.connection.getEstado());
    }

    @Test
    public void testCerradoNoSoportadoParar() {
        try {
            this.connection.parar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testCerradoNoSoportadoIniciar() {
        try {
            this.connection.iniciar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testCerradoNoSoportadoEnviar() {
        try {
            this.connection.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testCerradoNoSoportadoRecibir() {
        try {
            this.connection.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testPreparadoAbrir() {
        this.connection.abrir();
        this.connection.abrir();
        assertEquals(StateEnum.PREPARED, this.connection.getEstado());
    }

    @Test
    public void testPreparadoCerrar() {
        this.connection.abrir();
        this.connection.cerrar();
        assertEquals(StateEnum.CLOSED, this.connection.getEstado());
    }

    @Test
    public void testPreparadoParar() {
        this.connection.abrir();
        this.connection.parar();
        assertEquals(StateEnum.STOPPED, this.connection.getEstado());
    }

    @Test
    public void testPreparadoIniciar() {
        this.connection.abrir();
        this.connection.iniciar();
        assertEquals(StateEnum.PREPARED, this.connection.getEstado());
    }

    @Test
    public void testPreparadoEnviar() {
        this.connection.abrir();
        this.connection.enviar("...");
        assertEquals(StateEnum.WAITING, this.connection.getEstado());
        assertEquals("...", link.getMsg());
    }

    @Test
    public void testPreparadoNoSoportadoRecibir() {
        this.connection.abrir();
        try {
            this.connection.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testParadoNoSoportadoAbrir() {
        this.connection.abrir();
        this.connection.parar();
        try {
            this.connection.abrir();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testParadoNoSoportadoCerrar() {
        this.connection.abrir();
        this.connection.parar();
        try {
            this.connection.cerrar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testParadoParar() {
        this.connection.abrir();
        this.connection.parar();
        this.connection.parar();
        assertEquals(StateEnum.STOPPED, this.connection.getEstado());
    }

    @Test
    public void testParadoIniciar() {
        this.connection.abrir();
        this.connection.parar();
        this.connection.iniciar();
        assertEquals(StateEnum.PREPARED, this.connection.getEstado());
    }

    @Test
    public void testParadoNoSoportadoEnviar() {
        this.connection.abrir();
        this.connection.parar();
        try {
            this.connection.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testParadoNoSoportadoRecibir() {
        this.connection.abrir();
        this.connection.parar();
        try {
            this.connection.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testEsperandoNoSoportadoAbrir(){
        this.connection.abrir();
        this.connection.enviar("");
        try {
            this.connection.abrir();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoCerrar(){
        this.connection.abrir();
        this.connection.enviar("");
        try {
            this.connection.cerrar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoParar(){
        this.connection.abrir();
        this.connection.enviar("");
        try {
            this.connection.parar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoIniciar(){
        this.connection.abrir();
        this.connection.enviar("");
        try {
            this.connection.iniciar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoEnviar(){
        this.connection.abrir();
        this.connection.enviar("");
        try {
            this.connection.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoRecibirACK() {
        this.connection.abrir();
        this.connection.enviar("...");
        this.connection.recibir(Link.ACK);
        assertEquals(StateEnum.PREPARED, this.connection.getEstado());
    }

    @Test
    public void testEsperandoRecibirError() {
        this.connection.abrir();
        this.connection.enviar("...");
        this.connection.recibir(1);
        assertEquals(StateEnum.CLOSED, this.connection.getEstado());
    }


}
