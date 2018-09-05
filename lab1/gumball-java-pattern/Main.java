

public class Main {

    public static void main(String[] args) {
        testSingleQuarterGumballMachine();
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
}