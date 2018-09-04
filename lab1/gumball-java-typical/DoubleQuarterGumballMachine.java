
/**
 * DoubleQuarterGumballMachine is a mode of GumballMachine which can only 
 * insert quarter. Each gumball costs 50 cents.
 *
 * @Name: Xiaoxiao Ren
 * @Email: renxx0908@gmail.com
 */
public class DoubleQuarterGumballMachine implements GumballMachine
{
    // instance variables - replace the example below with your own
    private int num_gumballs;
    private int num_quarters;
    
    /**
     * Constructor for objects of class DoubleQuarterGumballMachine
     */
    public DoubleQuarterGumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.num_quarters = 0;
    }

    public void insertCoin(int coin)
    {
        if (coin == 25) {
            this.num_quarters++;
        }
    }
    
    public void turnCrank()
    {
        if ( this.num_quarters == 2 )
        {
            this.num_gumballs-- ;
            this.num_quarters -= 2;
            System.out.println( "Thanks for your quarters.  Gumball Ejected!" ) ;
        } 
        else if ( this.num_quarters == 1)
        {
            if ( this.num_gumballs > 0 )
            {
                System.out.println( "Please insert another quarter" ) ;
            }
            else
            {
                this.num_quarters--;
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }
    }
}
