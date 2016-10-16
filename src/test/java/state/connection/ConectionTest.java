package state.connection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ConectionTest {
    private Conection Conection;

    private LinkMock link;

    @Before
    public void ini() {
        this.link = new LinkMock();
        this.Conection = new Conection(this.link);
    }

    @Test
    public void testStateEnumInicial() {
        assertEquals(StateEnum.CLOSED, this.Conection.getEstado());
    }

    @Test
    public void testCerradoAbrir() {
        this.Conection.abrir();
        assertEquals(StateEnum.PREPARED, this.Conection.getEstado());
    }

    @Test
    public void testCerradoCerrar() {
        this.Conection.cerrar();
        assertEquals(StateEnum.CLOSED, this.Conection.getEstado());
    }

    @Test
    public void testCerradoNoSoportadoParar() {
        try {
            this.Conection.parar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testCerradoNoSoportadoIniciar() {
        try {
            this.Conection.iniciar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testCerradoNoSoportadoEnviar() {
        try {
            this.Conection.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testCerradoNoSoportadoRecibir() {
        try {
            this.Conection.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testPreparadoAbrir() {
        this.Conection.abrir();
        this.Conection.abrir();
        assertEquals(StateEnum.PREPARED, this.Conection.getEstado());
    }

    @Test
    public void testPreparadoCerrar() {
        this.Conection.abrir();
        this.Conection.cerrar();
        assertEquals(StateEnum.CLOSED, this.Conection.getEstado());
    }

    @Test
    public void testPreparadoParar() {
        this.Conection.abrir();
        this.Conection.parar();
        assertEquals(StateEnum.STOPPED, this.Conection.getEstado());
    }

    @Test
    public void testPreparadoIniciar() {
        this.Conection.abrir();
        this.Conection.iniciar();
        assertEquals(StateEnum.PREPARED, this.Conection.getEstado());
    }

    @Test
    public void testPreparadoEnviar() {
        this.Conection.abrir();
        this.Conection.enviar("...");
        assertEquals(StateEnum.WAITING, this.Conection.getEstado());
        assertEquals("...", link.getMsg());
    }

    @Test
    public void testPreparadoNoSoportadoRecibir() {
        this.Conection.abrir();
        try {
            this.Conection.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testParadoNoSoportadoAbrir() {
        this.Conection.abrir();
        this.Conection.parar();
        try {
            this.Conection.abrir();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testParadoNoSoportadoCerrar() {
        this.Conection.abrir();
        this.Conection.parar();
        try {
            this.Conection.cerrar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    @Test
    public void testParadoParar() {
        this.Conection.abrir();
        this.Conection.parar();
        this.Conection.parar();
        assertEquals(StateEnum.STOPPED, this.Conection.getEstado());
    }

    @Test
    public void testParadoIniciar() {
        this.Conection.abrir();
        this.Conection.parar();
        this.Conection.iniciar();
        assertEquals(StateEnum.PREPARED, this.Conection.getEstado());
    }

    @Test
    public void testParadoNoSoportadoEnviar() {
        this.Conection.abrir();
        this.Conection.parar();
        try {
            this.Conection.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testParadoNoSoportadoRecibir() {
        this.Conection.abrir();
        this.Conection.parar();
        try {
            this.Conection.recibir(0);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }
    
    @Test
    public void testEsperandoNoSoportadoAbrir(){
        this.Conection.abrir();
        this.Conection.enviar("");
        try {
            this.Conection.abrir();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoCerrar(){
        this.Conection.abrir();
        this.Conection.enviar("");
        try {
            this.Conection.cerrar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoParar(){
        this.Conection.abrir();
        this.Conection.enviar("");
        try {
            this.Conection.parar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoIniciar(){
        this.Conection.abrir();
        this.Conection.enviar("");
        try {
            this.Conection.iniciar();
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoNoSoportadoEnviar(){
        this.Conection.abrir();
        this.Conection.enviar("");
        try {
            this.Conection.enviar("");
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }        
    }
    
    @Test
    public void testEsperandoRecibirACK() {
        this.Conection.abrir();
        this.Conection.enviar("...");
        this.Conection.recibir(Link.ACK);
        assertEquals(StateEnum.PREPARED, this.Conection.getEstado());
    }

    @Test
    public void testEsperandoRecibirError() {
        this.Conection.abrir();
        this.Conection.enviar("...");
        this.Conection.recibir(1);
        assertEquals(StateEnum.CLOSED, this.Conection.getEstado());
    }


}
