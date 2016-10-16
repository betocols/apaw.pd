package state.connection;

public class StateSend extends State {

	@Override
	public String toString() {
		return "Estado Parado";
	}

	@Override
	public void open(Conection conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void close(Conection conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void stop(Conection conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void initialize(Conection conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void send(Conection conection, String msg) {
		if (conection.getEstado() == StateEnum.CLOSED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (conection.getEstado() == StateEnum.STOPPED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (conection.getEstado() == StateEnum.PREPARED) {
			conection.getLink().send(msg);
			conection.setEstado(StateEnum.WAITING);
		} else if (conection.getEstado() == StateEnum.WAITING) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}

	}

	@Override
	public void receive(Conection conection, int response) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

}
