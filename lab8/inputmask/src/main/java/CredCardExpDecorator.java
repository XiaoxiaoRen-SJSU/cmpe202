/* (c) Copyright 2018 Xiaoxiao Ren. All Rights Reserved */

public class CredCardExpDecorator extends Decorator {
	
	private String currentStr;

	public CredCardExpDecorator(IDisplayComponent c) {
		super(c);
	}

	public String display() {
		currentStr = super.display();
		return parseStr(currentStr);
	}

	private String parseStr(String str) {
		String result = "[";
		if (str.length() > 2) {
			result = result.concat(str.substring(0, 2));
			result = result.concat("/");
			result = result.concat(str.substring(2, str.length()));
			result = result.concat("]  ");
			return result;
		}
		if (str.length() == 2) {
			result = result.concat(str.substring(0, 2));
			result = result.concat("/");
			result = result.concat("]  ");
			return result;
		}

		result = result.concat(str);
		result = result.concat("]  ");
		return result;
	}	
}