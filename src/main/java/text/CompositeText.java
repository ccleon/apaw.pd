package text;

import java.util.ArrayList;
import java.util.List;

public abstract class CompositeText extends TextComponent{
	private List <TextComponent> textComponentList;
	
	public CompositeText (){
		this.textComponentList = new ArrayList<TextComponent>();
	}
	
	@Override
	public String printFull (boolean capitalLetters){
		String aux="";
		for (TextComponent textComponent : textComponentList) {
			aux += textComponent.printFull(capitalLetters);
		}
		return aux+separator();
	}
	
	@Override
	public boolean isComposite (){
		return true;
	}
	
	public List<TextComponent> getList(){
		return this.textComponentList;
	}
	
	public abstract String separator();
}
