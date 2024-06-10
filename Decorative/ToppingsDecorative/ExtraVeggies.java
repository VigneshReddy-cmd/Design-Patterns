package Decorative.ToppingsDecorative;

import Decorative.basePizza.BasePizza;
public class ExtraVeggies extends ToppingsDecorative {

    BasePizza basePizza;
    public ExtraVeggies(BasePizza pizza)
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
        return basePizza.cost()+40;
    }
    
}
