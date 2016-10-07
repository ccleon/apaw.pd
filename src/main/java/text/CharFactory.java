package text;

import java.util.HashMap;
import java.util.Map;

public class CharFactory {
	private static CharFactory charFactory;
	private Map<Character, Characterr> mapChar;
	
	private CharFactory(){
		this.mapChar = new HashMap<>();
	}
	
	public static CharFactory getFactory(){
		if (charFactory == null){
			charFactory = new CharFactory();
    	};
    	return charFactory;
	}	
	
	public Characterr get (char key) {
		if(mapChar.containsKey(key)) {
			return mapChar.get(key);
		}else{
			Characterr charr = new Characterr(key);
			mapChar.put(key, charr);
			return charr;
		}
	}
}
