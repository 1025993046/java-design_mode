package 实验四.观察者模式;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected List<Observer> observers;

    public void addObserver(Observer observer) {
        if (observers == null)
            observers = new ArrayList<>();
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
