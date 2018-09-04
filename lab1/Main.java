

public class Main {
    
    public static void main(String[] args) {
        testSingleQuarterGumballMachine();
        testDoubleQuarterGumballMachine();
    }
    
    public static void testSingleQuarterGumballMachine() {
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
    
    public static void testDoubleQuarterGumballMachine() {
        GumballMachine gumballMachine = new DoubleQuarterGumballMachine(2);

        System.out.println(gumballMachine);
        
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
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
        
        System.out.println(gumballMachine);
    }
}
