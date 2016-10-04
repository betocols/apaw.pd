package factoryMethod.naturalNumber;

public class NaturalNumberManager {
	private NaturalNumber naturalNumber;
	private NaturalNumberCreator creator;
	
	public void setCreator(NaturalNumberCreator creator) {
		this.creator = creator;
	}
	
	public void createNaturalNumber(int value) {
		this.naturalNumber = this.creator.createNaturalNumber(value);
	}
	
	public NaturalNumber getNaturalNumber() {
		return naturalNumber;
	}
}
