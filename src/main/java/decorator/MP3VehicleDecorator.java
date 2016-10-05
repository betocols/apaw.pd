package decorator;

public class MP3VehicleDecorator extends VehicleDecorator {
	private static String DESCRIPTION = "MP3";
	private static int PRICE = 5;
	
	public MP3VehicleDecorator(VehicleComponent component) {
		super(DESCRIPTION, PRICE, component);
	}
}
