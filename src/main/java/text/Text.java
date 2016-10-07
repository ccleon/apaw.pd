package text;

public class Text extends CompositeText{
	public Text(){
		super();
	}

	@Override
	public void add(TextComponent textComponent) {
		if(textComponent.isComposite() == true){
			this.getList().add(textComponent);
		}else{
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void remove(TextComponent textComponent) {
		if (textComponent.isComposite() == true){
			this.getList().remove(textComponent);
		}else{
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public String separator() {
		return "---o---\n";
	}
}
