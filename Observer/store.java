package Observer;
import Observer.Observable.IphoneObservable;
import Observer.Observable.StockObservable;
import Observer.Observer.MobileAlertObserver;
import Observer.Observer.EmailAlertObserver;
import Observer.Observer.NotificationalertObserver;
public class store {
    public static void main(String[] args) {
        StockObservable iphone=new IphoneObservable();
       NotificationalertObserver obs1=new EmailAlertObserver("vignesh@gmail.com",iphone); 
       NotificationalertObserver obs2=new MobileAlertObserver("vignesh",iphone); 
       NotificationalertObserver obs3=new EmailAlertObserver("Nani@gmail.com",iphone); 
       NotificationalertObserver obs4=new MobileAlertObserver("vignesh REDDY",iphone); 

       iphone.add(obs1);
       iphone.add(obs2);
       iphone.add(obs4);
       iphone.add(obs3);

       iphone.set_data(10);
       iphone.set_data(100);
    }
}
