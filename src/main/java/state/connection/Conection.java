package state.connection;

public class Conection {
	private StateEnum estado;
	private Link link;
	private State state;
	
	public Conection(Link link) {
		assert link != null;
		this.link = link;
		this.estado = StateEnum.CLOSED;
		setState(new StateOpen());
	}

	public Link getLink() {
		return link;
	}

	public StateEnum getEstado() {
		return this.estado;
	}

    protected void setEstado(StateEnum estado) {
        this.estado = estado;
    }

    protected void setState(State state) {
        this.state = state;
    }
    
	public void abrir() {
		setState(new StateOpen());
		this.state.open(this);
	}

	public void cerrar() {
		setState(new StateClose());
		this.state.close(this);
	}

	public void parar() {
		setState(new StateStop());
		this.state.stop(this);
	}

	public void iniciar() {
		setState(new StateStart());
		this.state.initialize(this);
	}

	public void enviar(String msg) {
		setState(new StateSend());
		this.state.send(this, msg);
	}

	public void recibir(int response) {
        setState(new StateReceive());
        this.state.receive(this, response);
	}

}
