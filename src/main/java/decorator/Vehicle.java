package decorator;

public class Vehicle extends VehicleComponent {

	public Vehicle(String description, int price) {
		super(description, price);
	}
	
	@Override
	public String finalDescription() {
		return getDescription();
	}

	@Override
	public int finalPrice() {
		return getPrice();
	}

}
