/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CredCardField num;
    private CredCardField exp;
    private CredCardField cvc;
    private CredCardField noStateHeadField;
    private CredCardField noStateTailField;
    private IState numState;
    private IState expState;
    private IState cvcState;
    private IState noStateHead;
    private IState noStateTail;
    private IDisplayComponent numDecorator;
    private IDisplayComponent expDecorator;
    private IDisplayComponent cvcDecorator;

    public App() {
        screen = new Screen();

        numState = new CredCardState(screen);
        expState = new CredCardState(screen);
        cvcState = new CredCardState(screen);
        noStateHead = new CredCardState(screen);
        noStateTail = new CredCardState(screen);

        numState.setName("CARD_NUM");
        expState.setName("CARD_EXP");
        cvcState.setName("CARD_CVC");
        noStateHead.setName("NO_STATE");
        noStateTail.setName("NO_STATE");

        noStateHead.setNextState(numState);
        numState.setPrevState(noStateHead);
        numState.setNextState(expState);
        expState.setPrevState(numState);
        expState.setNextState(cvcState);
        cvcState.setPrevState(expState);
        cvcState.setNextState(noStateTail);
        noStateTail.setPrevState(cvcState);

        num = new CredCardField("4444444444444444");
        exp = new CredCardField("MMYY");
        cvc = new CredCardField("###");
        noStateHeadField = new CredCardField("");
        noStateTailField = new CredCardField("");

        num.setMaxCount(16);
        exp.setMaxCount(4);
        cvc.setMaxCount(3);
        noStateHeadField.setMaxCount(0);
        noStateTailField.setMaxCount(0);

        numDecorator = new CredCardNumDecorator(num);
        expDecorator = new CredCardExpDecorator(exp);
        cvcDecorator = new CredCardCVCDecorator(cvc);

        numState.setField(num);
        expState.setField(exp);
        cvcState.setField(cvc);
        noStateHead.setField(noStateHeadField);
        noStateTail.setField(noStateTailField);

        screen.addSubComponent(numDecorator);
        screen.addSubComponent(expDecorator);
        screen.addSubComponent(cvcDecorator);

        screen.setState(noStateHead);
        screen.setState(noStateHead);
    }

    public String display() {
        int screenNameLen = screen.name().length();
        String output = "";
        output += "========================================\n";
        for (int i = 0; i < (40 - screenNameLen)/2; i++) {
            output += " ";
        }
        output +=  screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        output += " PREV: " + screen.getPrevState().name();
        output += "  CURR: " + screen.getState().name();
        output += "  #: " + screen.getState().getField().getContents().length() + "\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        screen.key(ch);
    }
}

