

import java.util.Random;

public class EnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public EnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin) {
        gumballMachine.setMoney(coin);
    }
 
    public void ejectCoin() {
        gumballMachine.ejectMoney();
        gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
