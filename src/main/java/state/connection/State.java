package state.connection;

public abstract class State {
    
    public abstract void open(Conection conection);
    public abstract void close(Conection conection);
    public abstract void stop(Conection conection);
    public abstract void initialize(Conection conection);
    public abstract void send(Conection conection, String msg);
    public abstract void receive(Conection conection, int respuesta);
}
