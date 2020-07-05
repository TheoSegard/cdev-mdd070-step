package list_linkedlist;

import _2_iterator._2_iterator.Element;
import _2_iterator._2_iterator._1_world._2_avecpattern.WorldIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayMaList implements MaList {

    private String[] array = new String[10];
    private int size = 0;

    @Override
    public void add(String valeur) {
        if (this.size >= this.array.length) {
            String[] newArray = new String[this.size * 2];

            // copier array dans newArray
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }

            // on référence le nouveau tableau
            this.array = newArray;
        }
        this.array[size] = valeur;
        this.size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int position, String valeur) {

        String[] newTab = new String[this.array.length];
        for(int i = 0; i < position; i++) {

            newTab[i] = this.array[i];
        }
        newTab[position] = valeur;
        for(int i = position + 1; i < this.array.length; i++)  {

            newTab[i] = this.array[i - 1];
        }

        this.array = newTab;
    }


    @Override
    public String get(int position) {
        return this.array[position];
    }

//    @Override
//    public Iterator<String> iterator() {
//        // initializing ArrayList
//        List<String> listeArray = Arrays.asList(this.array);
//
//        // Looping ArrayList using Iterator
//        Iterator it = listeArray.iterator();
//
//        return it;
//    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayListIterator(this);
    }


}
