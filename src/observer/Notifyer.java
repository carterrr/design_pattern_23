package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CarterChou at 2019/4/9 18:57
 * @description  通知者
 */
public class Notifyer {
    private List <Observer>  observers = new ArrayList<>();


    /**
     * 新增观察者
     * @param observer
     */
    public void  attach(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifys() {
        for(Observer observer : observers) {
            observer.update() ;
        }
    }
}
