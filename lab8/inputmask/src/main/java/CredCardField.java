/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CredCardField implements IDisplayComponent
{

	private String Contents = "" ;
	private String DEFAULT;
	private int MAX_COUNT = -1;

	public CredCardField(String d) {
		DEFAULT = d;
	}

    public String getContents() {
    	return Contents;
    }	

    public String getDefault() {
    	return DEFAULT;
    }

    public void setMaxCount(int m) {
		MAX_COUNT = m;
	}

    public void AddNumber(String ch) {
    	if (!isFull()) {
    		Contents = Contents.concat(ch);
    	}
    }

    public void DelNumber(String ch) {
    	if (!isEmpty()) {
    		Contents = Contents.substring(0, Contents.length() - 1);
    	}
    }

	public String display() {
		if (isEmpty()) {
			return getDefault();
		}
		else {
			return getContents();
		}
	}

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

	public boolean isEmpty() {
		return (Contents.length() == 0);
	}

	public boolean isFull() {
		return (Contents.length() == MAX_COUNT);
	}

}