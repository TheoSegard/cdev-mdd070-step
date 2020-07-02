package list_linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedMaList implements MaList {

    private Node first = null;
    private Node last = null;
    private int size = 0;

    public String getValue(){
        return first.getValeur();
    }

    public String getValueLast(){
        return last.getValeur();
    }

    public String getValue2(){
        return first.getNext().getValeur();
    }

    @Override
    public void add(String valeur) {
        if (first == null) {
            first = new Node();
            first.setValeur(valeur);
            last = first;
        } else {
            Node newLast = new Node();
            newLast.setValeur(valeur);

            last.setNext(newLast);

            this.last = newLast;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int position, String valeur) {
        //create new node.
        Node node = new Node();
        node.setValeur(valeur);
        node.setNext(null);

        if (this.first == null) {
            //if head is null and position is zero then exit.
            if (position != 0) {
                return;
            } else { //node set to the head.
                this.first = node;
            }
        }

        if (first != null && position == 0) {
            node.setNext(this.first);
            this.first = node;
            return;
        }

        Node current = this.first;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.getNext();

            if (current == null) {
                break;
            }

            i++;
        }

        node.setNext(current);
        previous.setNext(node);
    }

    @Override
    public String get(int position) {
        int i =0;
        Node nodeActual = first;

        if(position < size-1) {
            while(nodeActual.getNext() != null && i < position) {

                nodeActual = nodeActual.getNext();
            }

        } else if(position == size-1){
            nodeActual = last;
        }

        return nodeActual.getValeur();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private Node followingNode = first;

            @Override
            public boolean hasNext() {
                return followingNode != null;
            }

            @Override
            public String next() {
                if (followingNode == null) {
                    throw new NoSuchElementException();
                }
                String toReturn = followingNode.getValeur();
                followingNode = followingNode.getNext();
                return toReturn;
            }
        };
    }

}
