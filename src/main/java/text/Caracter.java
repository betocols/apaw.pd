package text;

public class Caracter extends Componente {
	private char caracter;
	
	public Caracter(char caracter) {
		this.caracter = caracter;
		setEsCompuesto(false);
	}
	
	@Override
	public void add(Componente componente) {}
		
	@Override
	public void delete(Componente componente) {}
	
	@Override
	public String dibujar(boolean esMayuscula) {
		if (esMayuscula) {
			return String.valueOf(caracter).toUpperCase();
		}
		return String.valueOf(caracter);
	}
}
