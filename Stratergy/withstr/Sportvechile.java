package Stratergy.withstr;

import Stratergy.withstr.DriveStartiege.SportsDRIVESTART;
// import the sport drive start
public class Sportvechile extends Vechile {
   public Sportvechile()
   {
     super(new SportsDRIVESTART());
   }
   public static void main(String[] args) {
     Vechile vh=new Sportvechile();
     vh.drive();
   }
}
