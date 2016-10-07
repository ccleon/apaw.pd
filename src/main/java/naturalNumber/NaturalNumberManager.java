package naturalNumber;

public class NaturalNumberManager {
	
	private NaturalNumber naturalnumber;
    private NaturalNumberCreator creator;

    public void setCreator(NaturalNumberCreator creator) {
        this.creator = creator;
    }

    public void createNaturalNumber(int value) {
        this.setNaturalNumber(this.creator.createNaturalNumber(value));
    }

    public NaturalNumber getNaturalNumber() {
        return naturalnumber;
    }
    
    public void setNaturalNumber (NaturalNumber nn){
    	this.naturalnumber = nn;
    }
}