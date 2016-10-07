package text;

public class Characterr extends TextComponent{
	private char character;
	
	public Characterr (char character){
		this.character = character;
	}
	
	@Override
	public void add (TextComponent textComponent){
		//Se ignora
	}
	
	@Override
	public void remove (TextComponent textComponent){
		//Se ignora
	}
	
	@Override
	public String printFull (boolean capitalLetters){
		if (capitalLetters == false) {
			return (""+ this.character);
		}else{
			return (""+ this.character).toUpperCase();
		}
	}
	
	@Override
	public boolean isComposite() {
		return false;
	}
}
