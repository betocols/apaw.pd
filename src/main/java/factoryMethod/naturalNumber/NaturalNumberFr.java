package factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {
	private static String[] textValue = {"zero", "un", "due", "trois", "quattre", "cinq"};
    
	public NaturalNumberFr(int value) {
		super(value, textValue);
    }
}
