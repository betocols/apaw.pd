package state.connection;

public final class LinkMock implements Link {
    private String msg;

    private int respuesta;

    public String getMsg() {
        return msg;
    }

    public int getRespuesta() {
        return respuesta;
    }

    @Override
    public void send(String msg) {
        this.msg = msg;
    }

    @Override
    public void receive(int respuesta) {
        this.respuesta = respuesta;
    }

}
