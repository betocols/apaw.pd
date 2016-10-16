package state.connection;

public abstract class State {
    
    public abstract void open(Conexion connection);
    public abstract void close(Conexion connection);
    public abstract void stop(Conexion connection);
    public abstract void initialize(Conexion connection);
    public abstract void send(Conexion connection, String msg);
    public abstract void receive(Conexion connection, int respuesta);
}
