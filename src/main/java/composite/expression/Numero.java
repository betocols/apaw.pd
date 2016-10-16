package composite.expression;

public class Numero extends Expression {
    
    private int numero;
    
    public Numero(int numero){
        this.numero = numero;
    }
    
    @Override
    public int operate() {
        return this.numero;
    }

    @Override
    public String toString() {
        return this.numero + "";
    }

}
