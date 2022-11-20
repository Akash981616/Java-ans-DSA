package ObserverPattern;

import java.util.*;
public abstract class subject {
    /**
     *
     */
    private List<Observer> observers;

    public Subject (){
        this.observers =  new ArrayList<>(); 
     }

    public void register(Obsever o) {
        observers.add(o);
    }

    public void unRegister(Observer o) {
        observers.remove(o);
    }

    public void notift() {
        for (Observer o : observers) {
            o.update(this);
        }
     }
}
