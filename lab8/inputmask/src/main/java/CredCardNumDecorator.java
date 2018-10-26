/* (c) Copyright 2018 Xiaoxiao Ren. All Rights Reserved */

public class CredCardNumDecorator extends Decorator {
	
	private String currentStr;

	public CredCardNumDecorator(IDisplayComponent c) {
		super(c);
	}

	public String display() {
		currentStr = super.display();
		return parseStr(currentStr);
	}

	private String parseStr(String str) {
		String result = "[";
		if (str.length() > 12) {
			result = result.concat(str.substring(0, 4));
			result = result.concat(" ");
			result = result.concat(str.substring(4, 8));
			result = result.concat(" ");
			result = result.concat(str.substring(8, 12));
			result = result.concat(" ");
			result = result.concat(str.substring(12, str.length()));
			result = result.concat("]  ");
			return result;
		}
		if (str.length() == 12) {
			result = result.concat(str.substring(0, 4));
			result = result.concat(" ");
			result = result.concat(str.substring(4, 8));
			result = result.concat(" ");
			result = result.concat(str.substring(8, 12));
			result = result.concat(" ");
			result = result.concat("]  ");
			return result;
		}
		if (str.length() > 8) {
			result = result.concat(str.substring(0, 4));
			result = result.concat(" ");
			result = result.concat(str.substring(4, 8));
			result = result.concat(" ");
			result = result.concat(str.substring(8, str.length()));
			result = result.concat("]  ");
			return result;
		}
		if (str.length() == 8) {
			result = result.concat(str.substring(0, 4));
			result = result.concat(" ");
			result = result.concat(str.substring(4, 8));
			result = result.concat(" ");
			result = result.concat("]  ");
			return result;
		}
		if (str.length() > 4) {
			result = result.concat(str.substring(0, 4));
			result = result.concat(" ");
			result = result.concat(str.substring(4, str.length()));
			result = result.concat("]  ");
			return result;
		}
		if (str.length() == 4) {
			result = result.concat(str.substring(0, 4));
			result = result.concat(" ");	
			result = result.concat("]  ");
			return result;
		}

		result = result.concat(str);
		result = result.concat("]  ");
		return result;
	}	
}