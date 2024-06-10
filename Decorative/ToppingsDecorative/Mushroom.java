package Decorative.ToppingsDecorative;

import Decorative.basePizza.BasePizza;
public class Mushroom extends ToppingsDecorative{

    BasePizza basePizza;
    public Mushroom(BasePizza pizza)
    {
        if(pizza==null)
        {
            System.out.println("First Order Pizza Then toppings");
            System.exit(0);
        }
        this.basePizza=pizza;
    }
    @Override
    public int cost() {
        if(basePizza==null)
        {
            System.out.print("First Order Pizza Then toppings");
        }
        return basePizza.cost()+50;
    }
    
}
