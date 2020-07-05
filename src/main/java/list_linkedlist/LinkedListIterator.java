package list_linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator implements Iterator<String>{
    private Node current;

    public LinkedListIterator(Node first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public String next() {
        if (current == null) {
            throw new NoSuchElementException();
        }
        String toReturn = current.getValeur();
        current = current.getNext();
        return toReturn;
    }
}
