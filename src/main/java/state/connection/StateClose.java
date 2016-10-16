package state.connection;

public class StateClose extends State {

	@Override
	public String toString() {
		return "Estado Cerrado";
	}

	@Override
	public void open(Conection conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void close(Conection conection) {
		if (conection.getEstado() == StateEnum.CLOSED) {
		} else if (conection.getEstado() == StateEnum.STOPPED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (conection.getEstado() == StateEnum.PREPARED) {
			conection.setEstado(StateEnum.CLOSED);
		} else if (conection.getEstado() == StateEnum.WAITING) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
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
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void receive(Conection conection, int response) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

}
