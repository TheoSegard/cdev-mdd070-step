package _3_observator._2_exercice;

import java.util.ArrayList;
import java.util.List;

public class Bouton implements Observable {

    private List<Observer> observers = new ArrayList<>();

    public void clic() {
        // TODO lancement le processus d'enregistrement ?
        //Click
        for (Observer observer : observers) {
            observer.clickEvent("save");
        }
    }

    @Override
    public void observe(Observer observer) {
        observers.add(observer);
    }
}
