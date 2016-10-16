package text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoCompuesto extends Componente {
	private List<Componente> componentes;
	
	public TextoCompuesto() {
		this.componentes = new ArrayList<Componente>();
		setEsCompuesto(true);
	}

	abstract void add(Componente componente);
	
	protected void addComponente(Componente componente) {
		componentes.add(componente);
	}

	abstract void delete(Componente componente);
	
	protected void deleteComponente(Componente componente) {
		if (!componentes.isEmpty()) {
			componentes.remove(componente);
		}
	}
	
	abstract String dibujar(boolean esMayuscula);
	
	protected String dibujarComponentes(boolean esMayuscula) {
		String result = "";
		for (Componente componente : getComponentes()) {
			result += componente.dibujar(esMayuscula);
			
		}
		return result;
	}
	
	public List<Componente> getComponentes() {
		return componentes;
	}

}
