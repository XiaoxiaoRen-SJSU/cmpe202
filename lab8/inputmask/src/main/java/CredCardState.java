/* (c) Copyright 2018 Xiaoxiao Ren. All Rights Reserved */

public class CredCardState implements IState {

	private IScreen currentScreen;

	private IState prevState;
	private IState nextState;
	private CredCardField currentField;

	private String name;

	public CredCardState(IScreen s) {
		currentScreen = s;
	}

	public void setName(String n) {
		name = n;
	}

	public String name() {
		return name;
	}

	public void setPrevState(IState s) {
		prevState = s;
	}

	public void setNextState(IState s) {
		nextState = s;
	}

	public void setField(CredCardField f) {
		currentField = f;
	}

	public CredCardField getField() {
		return this.currentField;
	}
 
	public void key(String ch) {
		if (isBackSpace(ch)) {
			if (currentField.isEmpty()) {
				if (trySwitchToPrevState()) {
					currentScreen.getState().key(ch);
				}
			}
			else {
				currentField.DelNumber(ch);
			}
			return;
		}

		if (isSingleDigitNumber(ch)) {
			if (currentField.isFull()) {
				if (trySwitchToNextState()) {
					currentScreen.getState().key(ch);
				}
			}
			else {
				currentField.AddNumber(ch);
			}
			return;
		}
	}


	private boolean isBackSpace(String ch) {
		return (ch.equals("X"));
	}

	private boolean isSingleDigitNumber(String ch) {
		return ch.matches("[0-9]");
	}

	private boolean trySwitchToPrevState() {
		if (prevState != null) {
			currentScreen.setState(prevState);
			return true;
		} else {
			return false;
		}
	}

	private boolean trySwitchToNextState() {
		if (nextState != null) {
			currentScreen.setState(nextState);
			return true;
		} else {
			return false;
		}
	}
}