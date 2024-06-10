package Observer.Observer;
import Observer.Observable.StockObservable;
public class MobileAlertObserver implements NotificationalertObserver {
   private String user_name;
   public StockObservable stock_obs;

   // constructor injection
   public MobileAlertObserver(String user_name,StockObservable stock_obs)
   {
        this.user_name=user_name;
        this.stock_obs=stock_obs;
   }
    @Override
    public void update() {
       send_Alert(user_name,"HURRY UP FOR GREATE SALE");
    }
    private void send_Alert(String name,String msg)
    {
       System.out.println(user_name+" ->"+msg);
    }
    
}
