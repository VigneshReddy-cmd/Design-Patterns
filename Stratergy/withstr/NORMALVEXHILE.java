package Stratergy.withstr;

import Stratergy.withstr.DriveStartiege.Normalstartiege;
public class NORMALVEXHILE extends Vechile {
   NORMALVEXHILE()
   {
     super(new Normalstartiege());
   }

   public static void main(String[] args) {
      NORMALVEXHILE nm=new NORMALVEXHILE();
      nm.drive();
   }
}
