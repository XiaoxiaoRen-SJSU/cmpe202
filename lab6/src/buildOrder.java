public class buildOrder {

    public static composite getOrder()
    {
        int sandwichCounts = 0;
        composite order = new composite() ;

        component burger = new LBB("LBB", 5.59, 1);

        component topping1 = new lettuce();
        component topping2 = new tomato();
        component topping3 = new gOnion();
        component topping4 = new jalaGrilled();

        // Setup Custom Burger Ingredients
        burger.addChild(topping1);
        burger.addChild(topping2);
        burger.addChild(topping3);
        burger.addChild(topping4);

        // Add Burger to the Order
        order.addChild( burger );

        component Fries = new Leaf("LTL CAJ", 1, 2.79);
        order.addChild(Fries);

        return order ;
    }
}
