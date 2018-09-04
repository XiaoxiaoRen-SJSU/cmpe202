
/**
 * AnyCoinGumballMachine is a mode of GumballMachine which can 
 * insert any coins(include 5, 10, 25 cents). Each gumball costs 50 cents.
 *
 * @Name: Xiaoxiao Ren
 * @Email: renxx0908@gmail.com
 */
public class AnyCoinGumballMachine implements GumballMachine
{
    // instance variables - replace the example below with your own
    private int num_gumballs;
    private int num_nickels;
    private int num_dimes;
    private int num_quarters;
    private int coins_inserted;

    /**
     * Constructor for objects of class AnyCoinGumballMachine
     */
    public AnyCoinGumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.num_nickels = 0;
        this.num_dimes = 0;
        this.num_quarters = 0;
        this.coins_inserted = 0;
    }

    public void insertCoin(int coin) 
    {
        if (coin == 5) {
            this.num_nickels++;
            this.coins_inserted += 5;
        }
        if (coin == 10) {
            this.num_dimes++;
            this.coins_inserted += 10;
        }
        if (coin == 25) {
            this.num_quarters++;
            this.coins_inserted += 25;
        }
    }
    
    public void turnCrank() 
    {
        printRemainMessage();
        
        if (coins_inserted >= 50) {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.coins_inserted -= 50;
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
                ejectCoins(this.coins_inserted);
            }
            else
            {
                System.out.println( "No More Gumballs!  Return your coins: " ) ;
                ejectCoins(this.coins_inserted);
            }
        } else {
            System.out.println( "Please insert more coins." ) ;
        }
    }
    
    private void ejectCoins( int coins ) 
    {
        int quarters_ejected = 0;
        int dimes_ejected = 0;
        int nickels_ejected = 0;
        
        if (coins >= 25) {
            quarters_ejected = ejectQuarters(this.coins_inserted);
            this.coins_inserted -= quarters_ejected * 25;
            dimes_ejected = ejectDimes(this.coins_inserted);
            this.coins_inserted -= dimes_ejected * 10;
            nickels_ejected = ejectNickels(this.coins_inserted);
            this.coins_inserted -= nickels_ejected * 5;
            printEjectedMessage(quarters_ejected, dimes_ejected, nickels_ejected) ;
        } else if (coins >= 10) {
            dimes_ejected = ejectDimes(this.coins_inserted);
            this.coins_inserted -= dimes_ejected * 10;
            nickels_ejected = ejectNickels(this.coins_inserted);
            this.coins_inserted -= nickels_ejected * 5;
            printEjectedMessage(quarters_ejected, dimes_ejected, nickels_ejected) ;
        } else if (coins >= 5 ) {
            nickels_ejected = ejectNickels(this.coins_inserted);
            this.coins_inserted -= nickels_ejected * 5;
            printEjectedMessage(quarters_ejected, dimes_ejected, nickels_ejected) ;
        } else {
            System.out.println( "No coin ejected." );
        }
        
        printRemainMessage();
    }
    
    private int ejectQuarters( int coins ) {
        int quarters_needed = coins / 25;
        if (this.num_quarters >= quarters_needed) {
            this.num_quarters -= quarters_needed;
            return quarters_needed;
        } else {
            this.num_quarters = 0;
            return this.num_quarters;
        }
    }
    
    private int ejectDimes( int coins ) {
        int dimes_needed = coins / 10;
        if (this.num_dimes >= dimes_needed) {
            this.num_dimes -= dimes_needed;
            return dimes_needed;
        } else {
            this.num_dimes = 0;
            return num_dimes;
        }
    }
    
    private int ejectNickels( int coins ) {
        int nickels_needed = coins / 5;
        if (this.num_nickels >= nickels_needed) {
            this.num_nickels -= nickels_needed;
            return nickels_needed;
        } else {
            this.num_nickels = 0;
            return num_nickels;
        }
    }
    
    private void printRemainMessage() {
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
    
    private void printEjectedMessage(int quarters_ejected,
                              int dimes_ejected,
                              int nickels_ejected) 
    {
        if (quarters_ejected <= 1) {
            System.out.println(quarters_ejected + " quarter ejected.");
        } else {
            System.out.println(quarters_ejected + " quarters ejected.");
        }
        
        if (dimes_ejected <= 1) {
            System.out.println(dimes_ejected + " dime ejected.");
        } else {
            System.out.println(dimes_ejected + " dimes ejected.");
        }
        
        if (nickels_ejected <= 1) {
            System.out.println(nickels_ejected + " nickel ejected.");
        } else {
            System.out.println(nickels_ejected + " nickels ejected.");
        }
    }
}
