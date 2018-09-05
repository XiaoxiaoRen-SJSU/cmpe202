

public class Main {

    public static void main(String[] args) {
        testSingleQuarterGumballMachine();
        System.out.println("**********************");
        testDoubleQuarterGumballMachine();
        System.out.println("**********************");
        testAnyCoinGumballMachine();
    }
    
    public static void testSingleQuarterGumballMachine() {
        GumballMachine gumballMachine = new SingleQuarterGumballMachine(2);

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.ejectCoin();
        gumballMachine.ejectCoin();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
    
    public static void testDoubleQuarterGumballMachine() {
        GumballMachine gumballMachine = new DoubleQuarterGumballMachine(2);

        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.ejectCoin();
        gumballMachine.ejectCoin();
        gumballMachine.insertCoin(25);
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        
        gumballMachine.insertCoin(25);
        gumballMachine.insertCoin(25);
        gumballMachine.ejectCoin();
        
        System.out.println(gumballMachine);

        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(25);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
    
    public static void testAnyCoinGumballMachine() {
        GumballMachine gumballMachine = new AnyCoinGumballMachine(3);

        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 5 );
        gumballMachine.turnCrank();
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.ejectCoin();
        gumballMachine.insertCoin( 5 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 5 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.turnCrank();
        gumballMachine.ejectCoin();
        
        System.out.println(gumballMachine);
        gumballMachine.printRemainMessage();

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
        gumballMachine.ejectCoin();
        
        System.out.println(gumballMachine);
        gumballMachine.printRemainMessage();
        
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 25 );
        gumballMachine.turnCrank();
        gumballMachine.ejectCoin();
        
        System.out.println(gumballMachine);
        gumballMachine.printRemainMessage();
        
        gumballMachine.insertCoin( 25 );
        gumballMachine.insertCoin( 10 );
        gumballMachine.turnCrank();
        gumballMachine.ejectCoin();
        
        System.out.println(gumballMachine);
        gumballMachine.printRemainMessage();

    }
}