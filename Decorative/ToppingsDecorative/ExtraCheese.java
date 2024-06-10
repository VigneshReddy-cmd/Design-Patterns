package Decorative.ToppingsDecorative;

import Decorative.basePizza.BasePizza;
public class ExtraCheese extends ToppingsDecorative{

    BasePizza basepizza;
    public ExtraCheese(BasePizza pizza)
    {
        if(pizza==null)
        {
            System.out.println("First Order Pizza Then toppings");
            System.exit(0);
        }
        this.basepizza=pizza;
    }
    @Override
    public int cost() {
        if(basepizza==null)
        {
            System.out.print("First Order Pizza Then toppings");
        }
        return basepizza.cost()+20;
    }
    
}
