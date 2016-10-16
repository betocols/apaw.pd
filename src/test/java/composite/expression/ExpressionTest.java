package composite.expression;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import composite.expression.Division;
import composite.expression.Expression;
import composite.expression.Multiplicacion;
import composite.expression.Numero;
import composite.expression.Resta;
import composite.expression.Suma;

public class ExpressionTest {
	private Expression exp1, exp2, exp3, exp4, exp5, exp6;

    @Before
    public void ini() {
        this.exp1 = new Numero(4);
        this.exp2 = new Suma(this.exp1, new Numero(2));
        this.exp3 = new Resta(this.exp1, new Numero(3));
        this.exp4 = new Multiplicacion(this.exp1, new Numero(2));
        this.exp5 = new Division(this.exp1, new Numero(3));
        this.exp6 = new Suma(new Resta(new Numero(3), new Multiplicacion(
                new Division(this.exp1, new Numero(2)), new Numero(3))), this.exp1); // ((3-((4/2)*3))+4)
    }

    @Test
    public void testValor() {
        assertEquals(4, this.exp1.operate());
    }

    @Test
    public void TestSuma() {
        assertEquals(6, this.exp2.operate());
    }

    @Test
    public void testResta() {
        assertEquals(1, this.exp3.operate());
    }

    @Test
    public void testMultiplicacion() {
        assertEquals(8, this.exp4.operate());
    }

    @Test
    public void testDivision() {
        assertEquals(1, this.exp5.operate());
    }

    @Test
    public void testCompuesto() {
        assertEquals(1, this.exp6.operate());
    }

    @Test
    public void testToString() {
        assertEquals("((3-((4/2)*3))+4)", this.exp6.toString());
    }
}
