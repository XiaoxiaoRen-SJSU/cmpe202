

public class Main {
    
    public static void main(String[] args) {
        testSingleQuarterGumballMachine();
        System.out.println("\n");
        testDoubleQuarterGumballMachine();
        System.out.println("\n");
        testAnyCoinGumballMachine();
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
    
    public static void testAnyCoinGumballMachine() {
        GumballMachine gumballMachine = new AnyCoinGumballMachine(3);

        System.out.println(gumballMachine);
        
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 5 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);

        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
        
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.turnCrank();
        
        System.out.println(gumballMachine);
    }
}
