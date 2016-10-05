package decorator;

public abstract class VehicleDecorator extends VehicleComponent {
	private VehicleComponent component;
	
	public VehicleDecorator(String description, int price, VehicleComponent component) {
		super(description, price);
		this.component= component;
	}
	
	@Override
	public String finalDescription() {
		return component.finalDescription() + "\n  -> " + getDescription();
	}

	@Override
	public int finalPrice() {
		return getPrice() + component.finalPrice();
	}
}
