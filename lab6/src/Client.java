public class Client {
    public static void main(String args[])
    {
        composite theOrder = buildOrder.getOrder() ;
        receiptStrategy s1 = new receiptForCustomer();
        s1.setOrder(theOrder);
        s1.printReceipt();
        receiptStrategy s2 = new receiptForKitchen();
        s2.setOrder(theOrder);
        s2.printReceipt();
    }
}
