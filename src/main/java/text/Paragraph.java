package text;

public class Paragraph extends CompositeText{
	public Paragraph(){
		super();
	}

	@Override
	public void add(TextComponent textComponent) {
		if(textComponent.isComposite() == true){
			throw new UnsupportedOperationException();
		}else{
			this.getList().add(textComponent);
		}
	}

	@Override
	public void remove(TextComponent textComponent) {
		if (textComponent.isComposite() == false){
			this.getList().remove(textComponent);
		}else{
			throw new UnsupportedOperationException();
		}
	}
	
	@Override
	public String separator (){
		return "\n";
	}
}
