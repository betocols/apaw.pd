package state.connection;

public class StateOpen extends State {

	@Override
	public String toString() {
		return "Estado Preparado";
	}

	@Override
	public void open(Connection connection) {
		if (connection.getEstado() == StateEnum.CLOSED) {
			connection.setEstado(StateEnum.PREPARED);
		} else if (connection.getEstado() == StateEnum.STOPPED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.PREPARED) {
		} else if (connection.getEstado() == StateEnum.WAITING) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
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
		throw new UnsupportedOperationException("Acción no permitida... ");
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
