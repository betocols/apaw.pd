package state.connection;

public class StateSend extends State {

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
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void initialize(Connection connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void send(Connection connection, String msg) {
		if (connection.getEstado() == StateEnum.CLOSED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.STOPPED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == StateEnum.PREPARED) {
			connection.getLink().send(msg);
			connection.setEstado(StateEnum.WAITING);
		} else if (connection.getEstado() == StateEnum.WAITING) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}

	}

	@Override
	public void receive(Connection connection, int response) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

}
