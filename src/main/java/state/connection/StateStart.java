package state.connection;

public class StateStart extends State {

	@Override
	public String toString() {
		return "Estado Preparado";
	}

	@Override
	public void open(Connection connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void close(Connection connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void stop(Connection connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void initialize(Connection connection) {
		if (connection.getEstado() == StateEnum.CLOSED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.STOPPED) {
			connection.setEstado(StateEnum.PREPARED);
		} else if (connection.getEstado() == StateEnum.PREPARED) {
		} else if (connection.getEstado() == StateEnum.WAITING) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}

	}

	@Override
	public void send(Connection connection, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void receive(Connection connection, int response) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

}
