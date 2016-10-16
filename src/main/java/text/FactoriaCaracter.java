package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	private static FactoriaCaracter factoriaCaracter;
	private Map<String, Caracter> caracteres;
	
	private FactoriaCaracter() {
		caracteres = new HashMap<String, Caracter>();
	}
	
	public static FactoriaCaracter getFactoria() {
		if (factoriaCaracter == null) {
			factoriaCaracter = new FactoriaCaracter(); 
		}
		return factoriaCaracter;
	}
	
	public Caracter get(char key) {
        if (caracteres.containsKey(String.valueOf(key))) {
            return caracteres.get(String.valueOf(key));
        } else {
            Caracter caracter = new Caracter(key);
            caracteres.put(String.valueOf(key), caracter);
            return caracter;
        }
	}
}
