package list_linkedlist;

import _2_iterator._2_iterator.Element;
import _2_iterator._2_iterator._1_world._1_sanspattern.World;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SampleUsage {

    public static void main(String[] args) {
        System.out.println("ArrayMaList :");
        ArrayMaList arrayMaList = new ArrayMaList();

        arrayMaList.add("test1");
        arrayMaList.add("test2");
        arrayMaList.add("test3");
        arrayMaList.add("test4");
        arrayMaList.add("test5");

        arrayMaList.add(1,"intrus");
        arrayMaList.add(4,"intrus2");

        for (Iterator<String> IteratorArray = arrayMaList.iterator(); IteratorArray.hasNext();){
            String element = IteratorArray.next();
            System.out.println(element);
        }

        System.out.println("---------------");
        System.out.println("---------------");

        System.out.println("LinkedMaListe :");
        // LinkedList :
        LinkedMaList linkedMaList = new LinkedMaList();
        linkedMaList.add("0");
        linkedMaList.add("1");
        linkedMaList.add("2");
        linkedMaList.add("3");
        linkedMaList.add("4");
        linkedMaList.add("5");

        linkedMaList.add(1, "intrus1");
        linkedMaList.add(3, "intrus2");

        for (Iterator<String> IteratorArray = linkedMaList.iterator(); IteratorArray.hasNext();) {
            String element = IteratorArray.next();
            System.out.println(element);
        }
    }
}
