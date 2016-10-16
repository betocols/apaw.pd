package text;

public abstract class Componente {
	private boolean esCompuesto;

	abstract void add(Componente componente);
	abstract void delete(Componente componente);
	abstract String dibujar(boolean esMayuscula);
	
	public boolean esCompuesto() {
		return esCompuesto;
	}
	
	protected void setEsCompuesto(boolean esCompuesto) {
		this.esCompuesto = esCompuesto;
	}
}
