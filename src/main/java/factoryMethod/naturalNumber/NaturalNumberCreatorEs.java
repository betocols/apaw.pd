package factoryMethod.naturalNumber;

public class NaturalNumberCreatorEs extends NaturalNumberCreator {

	@Override
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEs(value);
	}

}
