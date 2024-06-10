package Observer.Observable;

/**
 * StockObservable
 */
import Observer.Observer.NotificationalertObserver;
public interface StockObservable {
 public void add(NotificationalertObserver obj);
 public void remove(NotificationalertObserver obj);
 public void notifyall();
 public void set_data(int newStock);
 public int get_data();
}