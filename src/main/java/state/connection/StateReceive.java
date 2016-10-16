package state.connection;

public class StateReceive extends State {

	@Override
	public String toString() {
		return "Estado Recibiendo";
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
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void send(Connection connection, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void receive(Connection connection, int response) {

		if (connection.getEstado() == StateEnum.CLOSED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.STOPPED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.PREPARED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.WAITING) {
			if (response == 0) {
				connection.setEstado(StateEnum.PREPARED);

			} else {
				connection.setEstado(StateEnum.CLOSED);
			}
		}

	}

}
