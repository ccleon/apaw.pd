package text;

public abstract class TextComponent {
	
	public abstract void add (TextComponent textComponent);
	public abstract String printFull (boolean capitalLetters);
	public abstract void remove (TextComponent textComponent);
	public abstract boolean isComposite ();
	
}