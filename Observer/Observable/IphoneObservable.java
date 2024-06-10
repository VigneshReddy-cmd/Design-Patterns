package Observer.Observable;

import Observer.Observer.NotificationalertObserver;
import java.util.List;
import java.util.ArrayList;
public class IphoneObservable implements StockObservable {
    private List<NotificationalertObserver> list=new ArrayList<>();
    private int stock_count;
    @Override
    public void add(NotificationalertObserver obj) {
       list.add(obj);
       return;
    }

    @Override
    public void remove(NotificationalertObserver obj) {
       for(int i=0;i<list.size();i++)
       {
        if(obj.equals(list.get(i)))
        {
            list.remove(i);
            return;
        }
       }
    }

    @Override
    public void notifyall() {
       for(NotificationalertObserver observer:list)
       {
             observer.update();
       }
    }

    @Override
    public void set_data(int newStock) {
        if(stock_count==0)
        {
            notifyall();
        }
        stock_count=stock_count+newStock;
    }

    @Override
    public int get_data() {
        return stock_count;
    }
}

