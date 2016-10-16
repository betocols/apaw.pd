package state.connection;

public class StateClose extends State {

	@Override
	public String toString() {
		return "Estado Cerrado";
	}

	@Override
	public void open(Connection connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void close(Connection connection) {
		if (connection.getEstado() == StateEnum.CLOSED) {
		} else if (connection.getEstado() == StateEnum.STOPPED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.PREPARED) {
			connection.setEstado(StateEnum.CLOSED);
		} else if (connection.getEstado() == StateEnum.WAITING) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
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
