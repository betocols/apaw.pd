package state.connection;

public class StateOpen extends State {

	@Override
	public String toString() {
		return "Estado Preparado";
	}

	@Override
	public void open(Conection conection) {
		if (conection.getEstado() == StateEnum.CLOSED) {
			conection.setEstado(StateEnum.PREPARED);
		} else if (conection.getEstado() == StateEnum.STOPPED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (conection.getEstado() == StateEnum.PREPARED) {
		} else if (conection.getEstado() == StateEnum.WAITING) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
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
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void receive(Conection conection, int response) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

}
