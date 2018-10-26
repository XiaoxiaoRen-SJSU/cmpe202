/* (c) Copyright 2018 Xiaoxiao Ren. All Rights Reserved */

public interface IState {
	void key(String ch) ;
	void setPrevState(IState s);
	void setNextState(IState s);
	void setField(CredCardField f);
	CredCardField getField();
	void setName(String n);
	String name();
}