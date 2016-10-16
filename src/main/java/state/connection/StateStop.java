package state.connection;

public class StateStop extends State {

	@Override
	public String toString() {
		return "Estado Parado";
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
		if (connection.getEstado() == StateEnum.CLOSED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.STOPPED) {
		} else if (connection.getEstado() == StateEnum.PREPARED) {
			connection.setEstado(StateEnum.STOPPED);
		} else if (connection.getEstado() == StateEnum.WAITING) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}

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
