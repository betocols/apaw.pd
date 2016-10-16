package state.connection;

public interface Link {
    static final int ACK = 0;

    void send(String msg);
    void receive (int response);
}
