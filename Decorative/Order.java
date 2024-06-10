package Decorative;

import Decorative.basePizza.BasePizza;
import Decorative.basePizza.Magerita;
import Decorative.basePizza.ChickenPizza;
import Decorative.basePizza.RegularPizza;
import Decorative.basePizza.VegPizza;
import Decorative.ToppingsDecorative.ToppingsDecorative;
import Decorative.ToppingsDecorative.ExtraCheese;
import Decorative.ToppingsDecorative.ExtraVeggies;
import Decorative.ToppingsDecorative.Mushroom;
public class Order {
    
    public static void main(String[] args) {
        // ToppingsDecorative cheese=new ExtraCheese(null);
        // System.out.print(cheese.cost());
        BasePizza mg=new Magerita();
        BasePizza ch=new ChickenPizza();
        BasePizza reg=new RegularPizza();
        BasePizza veg=new VegPizza();
        System.out.println("Magerita pizza - 1 price :" +mg.cost());
        BasePizza pizza1=new ExtraCheese(ch);
        System.out.println("Chicken pizza with extra cheese pizza 2  pirice :"+pizza1.cost());
        BasePizza pizza2=new Mushroom(reg);
        System.out.println("Regular pizza with Muchroom pizza - 2   pirice :"+pizza2.cost());
        BasePizza pizza3=new ExtraVeggies(new ExtraCheese(new Mushroom(veg)));
        System.out.println(" Veg Pixzza eith extra veggies ,extra cheese , Mushroom pizza - 3 price :"
                                                          +pizza3.cost());
    }
}
