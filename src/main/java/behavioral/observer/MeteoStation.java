package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed{

    int temp;
    int pres;


    public void setMeasurements(int temp, int pres){
        this.temp = temp;
        this.pres = pres;
        notifyObservers();
    }

    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.handleMessage(temp, pres);
        }
    }
}
