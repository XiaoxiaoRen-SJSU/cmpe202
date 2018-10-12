import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;

public class receiptForCustomer implements receiptStrategy {
    composite order;

    /** constructor */
    public receiptForCustomer() {
    }

    public void setOrder(composite order) {
        this.order = order;
    }

    public void printReceipt() {
        int subtotal = 0;

        System.out.println("                 FIVE GUYS");
        System.out.println("             BURGERS AND FRIES");
        System.out.println("              STORE # CA-1294");
        System.out.println("            5353 ALMADEN EXPY N60");
        System.out.println("             SAN JOSE, CA 95118");
        System.out.println("              (P) 408-264-9300\n\n");
        System.out.println("            12/1/2016 1:46:54 PM\n");
        System.out.println("                 FIVE GUES");
        System.out.println("Order numer:       45\n");

        for(component c: order.getComponents()) {
            if (c.getDescription().equals("LBB")) {
                System.out.println(c.getCount() + "    " + c.getDescription() + "                              " + c.getPrice());
                System.out.println("      {{{{ BACON }}}}");
                System.out.println(c.getPrintMessage());
                subtotal += c.getPrice() * 100;
            }
            if(c.getDescription().equals("LTL CAJ")) {
                subtotal += c.getPrice() * 100;
                System.out.println(c.getCount() + "  " + c.getDescription() + "                            " + c.getPrice());
            }
        }

        System.out.println("   " + "Sub. Total:" + "                       $" + (double)subtotal/100);
    }
}
