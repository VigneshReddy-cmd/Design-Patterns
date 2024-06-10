package Observer.Observer;
import Observer.Observable.StockObservable;
public class EmailAlertObserver implements NotificationalertObserver{
    String email;
    private StockObservable stock_obs;
    public EmailAlertObserver(String email,StockObservable stock_obs)
    {
        this.email=email;
        this.stock_obs=stock_obs;
    }
    @Override
    public void update() {
        send_email(email,"HURRY GRAB OFFER");
    }
    private void send_email(String email,String msg)
    {
        // some email code
        System.out.println(email+" "+"Sent"+" -> "+ msg);

    }
    
}
