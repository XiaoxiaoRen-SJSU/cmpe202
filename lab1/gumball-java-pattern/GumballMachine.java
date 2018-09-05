

public abstract class GumballMachine {
 
    private State soldOutState;
    private State noEnoughCoinState;
    private State enoughCoinState;
    private State soldState;
 
    private State state = soldOutState;
    int count = 0;
    int money = 0;
    
    int num_quarters = 0;
    int num_dimes = 0;
    int num_nickels = 0;
 
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noEnoughCoinState = new NoEnoughCoinState(this);
        enoughCoinState = new EnoughCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noEnoughCoinState;
        } 
    }
 
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    abstract void releaseBall();
 
    int getCount() {
        return count;
    }
    
    int getMoney() {
        return money;
    }
    
    abstract void setMoney(int coin);
    
    abstract void ejectMoney();
    
    abstract boolean hasEnoughMoney();
    
    void refill(int count) {
        this.count = count;
        state = noEnoughCoinState;
    }

    public State getState() {
        return state;
    }
    
    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoEnoughCoinState() {
        return noEnoughCoinState;
    }

    public State getEnoughCoinState() {
        return enoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    abstract void printRemainMessage();
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
