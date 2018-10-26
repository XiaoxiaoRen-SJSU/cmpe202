/* (c) Copyright 2018 Xiaoxiao Ren. All Rights Reserved */

public class CredCardCVCDecorator extends Decorator {
	
	private String currentStr;

	public CredCardCVCDecorator(IDisplayComponent c) {
		super(c);
	}

	public String display() {
		currentStr = super.display();
		return parseStr(currentStr);
	}

	private String parseStr(String str) {
		String result = "[";
		result = result.concat(str);
		result = result.concat("]  ");
		return result;
	}	
}