/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

import java.util.* ;

public class Screen implements IScreen, IDisplayComponent
{
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>() ;
    private IState currentState;
    private IState prevState;  

    public void setState(IState s) {
        if (currentState != null) {
            setPrevState(currentState);
        }
        currentState = s;
    }

    private void setPrevState(IState s) {
        prevState = s; 
    }

    public IState getPrevState() {
        return this.prevState;
    }

    public IState getState() {
        return currentState;
    } 

    public void key(String ch) {
        currentState.key(ch);
    }
    
    public void addSubComponent( IDisplayComponent c )
    {
        components.add( c ) ;
    }
    
    public String display() { 
        String value = "" ;
        for (IDisplayComponent c : components )
        {
            value = value + c.display() ;
        }
        return value ; 
    }

    public String name() {
        return ("Input Mask Screen") ; 
    }

}
