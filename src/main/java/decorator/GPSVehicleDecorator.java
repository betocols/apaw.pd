package decorator;

public class GPSVehicleDecorator extends VehicleDecorator {
	private static String DESCRIPTION = "GPS";
	private static int PRICE = 10;
	
	public GPSVehicleDecorator(VehicleComponent component) {
		super(DESCRIPTION, PRICE, component);
	}
}
