package decorator;

public abstract class VehicleComponent {
	private String description;
	private int price;

	public VehicleComponent(String description, int price) {
		this.description = description;
		this.price = price;
	}
	
	public abstract String finalDescription();
	public abstract int finalPrice();

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}
}
