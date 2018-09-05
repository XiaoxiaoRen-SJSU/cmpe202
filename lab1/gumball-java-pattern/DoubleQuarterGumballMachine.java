
/**
 * Write a description of class DoubleQuarterGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleQuarterGumballMachine extends GumballMachine
{
    public DoubleQuarterGumballMachine(int numberGumballs) {
        super(numberGumballs);
    }
    
    boolean hasEnoughMoney() {
        if (this.getMoney() >= 50) return true;
        else return false;
    }
    
    void setMoney(int coin) {
        if (coin ==  25) {
            num_quarters++;
            money += coin;
        } else {
            System.out.println("The type of the coin you inserted is wrong!");
        }
    }
    
    void ejectMoney() {
        int quarters = this.money / 25;
        
        if (quarters <= 1) {
            System.out.println(quarters + " quarter are returned");
        } else {
            System.out.println(quarters + " quarters are returned");
        }
        this.num_quarters -= quarters;
        this.money -= quarters * 25;
    }
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
        
        money -= 50;
    }
    
    void printRemainMessage() {
        
    }
}
