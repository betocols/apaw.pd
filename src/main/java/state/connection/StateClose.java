package state.connection;

public class StateClose extends State {

	@Override
	public String toString() {
		return "Estado Cerrado";
	}

	@Override
	public void open(Conexion connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void close(Conexion connection) {
		if (connection.getEstado() == Estado.CERRADO) {
		} else if (connection.getEstado() == Estado.PARADO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (connection.getEstado() == Estado.PREPARADO) {
			connection.setEstado(Estado.CERRADO);
		} else if (connection.getEstado() == Estado.ESPERANDO) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
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
		throw new UnsupportedOperationException("Acción no permitida... ");

	}

}
