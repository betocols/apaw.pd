package text;

public class Texto extends TextoCompuesto {
	@Override
	public void add(Componente componente) {
		if (componente.esCompuesto()) {
			addComponente(componente);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void delete(Componente componente) {
		if (componente.esCompuesto()) {
			deleteComponente(componente);
		}
	}
	
	@Override
	public String dibujar(boolean esMayuscula) {
		return dibujarComponentes(esMayuscula) + "---o---\n";
	}
}
