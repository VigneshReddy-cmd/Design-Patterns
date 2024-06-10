package Stratergy.withstr;

import Stratergy.withstr.DriveStartiege.DriveStaartiegies;
public class Vechile {
     
    DriveStaartiegies obj;

    // using constructor for initialisation of drive modes
    public Vechile(DriveStaartiegies obj)
    {
       this.obj=obj;
    }

    // calling drive with the interface assosiated classes
    public void drive()
    {
       obj.drive();
    }
}
