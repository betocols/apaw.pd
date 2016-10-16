package state.connection;

public class StateStart extends State {

	@Override
	public String toString() {
		return "Estado Preparado";
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
		if (connection.getEstado() == Estado.CERRADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == Estado.PARADO) {
			connection.setEstado(Estado.PREPARADO);
		} else if (connection.getEstado() == Estado.PREPARADO) {
		} else if (connection.getEstado() == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}

	}

	@Override
	public void send(Conexion connection, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

	@Override
	public void receive(Conexion connection, int response) {
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

}
