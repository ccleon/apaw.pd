package factoryMethod.naturalNumber;

public class NaturalNumberEnCreator extends NaturalNumberCreator {
	
	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEn (value);
	}

}
