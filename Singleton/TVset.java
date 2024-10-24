package Singleton;

public class TVset {
    private volatile static TVset tVset=null;
     private TVset()
     {
        System.out.println("OBJECT INstanceted");
     }

     public static  TVset getTVsetInstance()
     {
        if(tVset==null) // optimisation
        {
            synchronized(TVset.class){
                if(tVset==null)  // double checking
                tVset=new TVset();
            }
        }
        return tVset;
     }
}
