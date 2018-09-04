

public class Main {
    
    public static void main(String[] args) {
        GumballMachine gumballMachine = new SingleQuarterGumballMachine(5);

        System.out.println(gumballMachine);
        
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
    }
}
