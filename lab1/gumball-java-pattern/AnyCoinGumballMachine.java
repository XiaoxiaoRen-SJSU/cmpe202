
/**
 * Write a description of class AnyCoinGumballMachine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnyCoinGumballMachine extends GumballMachine
{
    public AnyCoinGumballMachine(int numberGumballs) {
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
        } else if (coin == 10) {
            num_dimes++;
            money += coin;
        } else if (coin == 5) {
            num_nickels++;
            money += coin;
        } else {
            System.out.println("The type of the coin you inserted is wrong!");
        }
    }
    
    void ejectMoney() {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        
        if (this.money >= 25) {
            quarters = ejectQuarters();
            this.money -= quarters * 25;
            dimes = ejectDimes();
            this.money -= dimes * 10;
            nickels = ejectNickels();
            this.money -= nickels * 5;
            
            printEjectedMessage(quarters, dimes, nickels);
        } else if (this.money >= 10) {
            dimes = ejectDimes();
            this.money -= dimes * 10;
            nickels = ejectNickels();
            this.money -= nickels * 5;
            
            printEjectedMessage(quarters, dimes, nickels);
        } else if (this.money >= 5) {
            nickels = ejectNickels();
            this.money -= nickels * 5;
            
            printEjectedMessage(quarters, dimes, nickels);
        } else {
            System.out.println("No coin ejected.");
        }
    }
    
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
        
        money -= 50;
    }
    
    private int ejectQuarters() {
        int quarters_needed = this.money / 25;
        if (this.num_quarters >= quarters_needed) {
            this.num_quarters -= quarters_needed;
        } else {
            quarters_needed = this.num_quarters;
            this.num_quarters = 0;
        }
        
        return quarters_needed;
    }
    
    private int ejectDimes() {
        int dimes_needed = this.money / 10;
        if (this.num_dimes >= dimes_needed) {
            this.num_dimes -= dimes_needed;
        } else {
            dimes_needed = this.num_dimes;
            this.num_dimes = 0;
        }
        
        return dimes_needed;
    }
    
    private int ejectNickels() {
        int nickels_needed = this.money / 5;
        if (this.num_nickels >= nickels_needed) {
            this.num_nickels -= nickels_needed;
        } else {
            nickels_needed = this.num_nickels;
            this.num_nickels = 0;
        }
        
        return nickels_needed;
    }
    
    private void printEjectedMessage(int quarters, int dimes, int nickels) {
        if (quarters <= 1) {
            System.out.println(quarters + " quarter ejected.");
        } else {
            System.out.println(quarters + " quarters ejected.");
        }
        
        if (dimes <= 1) {
            System.out.println(dimes + " dime ejected.");
        } else {
            System.out.println(dimes + " dimes ejected.");
        }
        
        if (nickels <= 1) {
            System.out.println(nickels + " nickel ejected.");
        } else {
            System.out.println(nickels + " nickels ejected.");
        }
    }
    
    public void printRemainMessage() {
        if (this.num_quarters <= 1) {
            System.out.println(this.num_quarters + " quarter in machine.");
        } else {
            System.out.println(this.num_quarters + " quarters in machine.");
        }
        
        if (this.num_dimes <= 1) {
            System.out.println(this.num_dimes + " dime in machine.");
        } else {
            System.out.println(this.num_dimes + " dimes in machine.");
        }
        
        if (this.num_nickels <= 1) {
            System.out.println(this.num_nickels + " nickel in machine.");
        } else {
            System.out.println(this.num_nickels + " nickels in machine.");
        }
    }
}
