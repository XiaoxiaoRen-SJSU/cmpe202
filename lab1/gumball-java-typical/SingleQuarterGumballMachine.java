
/**
 * SingleQuarterGumballMachine is a mode of GumballMachine which can only 
 * insert quarter. Each gumball costs 25 cents.
 *
 * @Name: Xiaoxiao Ren
 * @Email: renxx0908@gmail.com
 */
public class SingleQuarterGumballMachine implements GumballMachine
{
    
    private int num_gumballs;       
    private boolean has_quarter;    
    
    public SingleQuarterGumballMachine( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertCoin(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
}
