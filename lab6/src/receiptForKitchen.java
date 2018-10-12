import java.sql.SQLOutput;

public class receiptForKitchen implements receiptStrategy{

    composite order;

    /** constructor */
    public receiptForKitchen() {
    }

    public void setOrder(composite order) {
        this.order = order;
    }

    public void printReceipt() {

        System.out.println("\n\n\n");
        System.out.println("Patties - 1\n\n");
        System.out.println("Order number:  45\n");
        System.out.println("          12/1/2016 1:46:54 PM");
        System.out.println("              FIVE GUYS\n");
        System.out.println("Sandwich# " +  order.getCount() + "");

        for(component c: order.getComponents()) {
            if (c.getDescription().equals("LBB")) {
                System.out.println(c.getCount() + "      " + c.getDescription());
                System.out.println(c.getPrintMessage());
                System.out.println("      {{{{ BACON }}}}");
            }
            if(c.getDescription().equals("LTL CAJ")) {
                System.out.println(c.getCount() + "    " + c.getDescription());
            }
        }

        System.out.println("Register: 1" + "          " + "Tran Seq No:  57845");
        System.out.println("Cashier: Sakda* S");
    }
}
