

public class NoEnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        gumballMachine.setMoney(coin);
        if (gumballMachine.hasEnoughMoney()) {
            System.out.println("You inserted enough coins.");
            gumballMachine.setState(gumballMachine.getEnoughCoinState());
        } else {
            System.out.println("You inserted a coin.");
        }
    }
 
    public void ejectCoin() {
        gumballMachine.ejectMoney();
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no enough coins");
     }
 
    public void dispense() {
        System.out.println("You need to insert more coins");
    } 
 
    public String toString() {
        return "waiting for more coins";
    }
}
