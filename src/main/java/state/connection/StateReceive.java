package state.connection;

public class StateReceive extends State {

	@Override
	public String toString() {
		return "Estado Recibiendo";
	}

	@Override
	public void open(Conection conection) {
		throw new UnsupportedOperationException("Acción no permitida... ");

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

		if (conection.getEstado() == StateEnum.CLOSED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (conection.getEstado() == StateEnum.STOPPED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (conection.getEstado() == StateEnum.PREPARED) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else if (conection.getEstado() == StateEnum.WAITING) {
			if (response == 0) {
				conection.setEstado(StateEnum.PREPARED);

			} else {
				conection.setEstado(StateEnum.CLOSED);
			}
		}

	}

}
