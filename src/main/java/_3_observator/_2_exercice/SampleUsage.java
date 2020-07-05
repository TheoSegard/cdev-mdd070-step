package _3_observator._2_exercice;

import _2_iterator._2_iterator.Element;
import _2_iterator._2_iterator._1_world._1_sanspattern.World;
import _3_observator._1_notification.LogObserver;

import java.util.Iterator;

public class SampleUsage {
    public static void main(String[] args) {
        Bouton bouton = new Bouton();
        Application application = new Application();

        bouton.observe(application);

        try {
            //Call Function click
            application.init();
            bouton.clic();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
