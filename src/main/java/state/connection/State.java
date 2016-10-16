package state.connection;

public abstract class State {
    
    public abstract void open(Connection connection);
    public abstract void close(Connection connection);
    public abstract void stop(Connection connection);
    public abstract void initialize(Connection connection);
    public abstract void send(Connection connection, String msg);
    public abstract void receive(Connection connection, int respuesta);
}
