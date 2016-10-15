package factoryMethod.naturalNumber;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

	public NaturalNumber createNaturalNumber(int value) {
		return new NaturalNumberEs(value);
	}
	
}
