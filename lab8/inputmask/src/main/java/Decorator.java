/* (c) Copyright 2018 Xiaoxiao Ren. All Rights Reserved */

public class Decorator implements IDisplayComponent {
	
	private IDisplayComponent component;

	public Decorator(IDisplayComponent c) {
		component = c;
	}

	public String display() {
		return component.display();
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
}