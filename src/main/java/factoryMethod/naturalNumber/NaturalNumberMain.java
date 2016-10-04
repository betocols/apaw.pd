package factoryMethod.naturalNumber;

public class NaturalNumberMain {
	private static NaturalNumberManager manager = new NaturalNumberManager();
	
	public static void main(String[] args) {
		NaturalNumberCreator es = new NaturalNumberCreatorEs();
		NaturalNumberCreator fr = new NaturalNumberCreatorFr();
		NaturalNumberCreator en = new NaturalNumberCreatorEn();
		
		manager.setCreator(es);
		manager.createNaturalNumber(1);
		System.out.println(manager.getNaturalNumber().getTextValue());

		manager.setCreator(en);
		manager.createNaturalNumber(1);
		System.out.println(manager.getNaturalNumber().getTextValue());

		manager.setCreator(fr);
		manager.createNaturalNumber(1);
		System.out.println(manager.getNaturalNumber().getTextValue());
	}
}
