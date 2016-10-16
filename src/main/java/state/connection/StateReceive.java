package state.connection;

public class StateReceive extends State {

	@Override
	public String toString() {
		return "Estado Recibiendo";
	}

	@Override
	public void open(Conexion connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void close(Conexion connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void stop(Conexion connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void initialize(Conexion connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void send(Conexion connection, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void receive(Conexion connection, int response) {

		if (connection.getEstado() == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == Estado.PREPARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == Estado.ESPERANDO) {
			if (response == 0) {
				connection.setEstado(Estado.PREPARADO);

			} else {
				connection.setEstado(Estado.CERRADO);
			}
		}

	}

}
