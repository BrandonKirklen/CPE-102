package Reverse;

import java.util.NoSuchElementException;

/**
 * Created by Brandon Kirklen on 5/31/2015.
 * Linked List
 */

public class LinkedList{
    private Link first;
    private int size;

    private class Link {
        public Object data;
        public Link next;
    }

    public int size(){
        return size;
    }
    public LinkedList() {
        first = null;
        size = 0;
    }

    public Object getFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public Object removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        Object object = first.data;
        first = first.next;
        size--;
        return object;
    }

    public void addFirst(Object object) {
        Link newLink = new Link();
        newLink.data = object;
        newLink.next = first;
        first = newLink;
        size++;
    }

    public ListIterator listIterator() {
        return new ListIterator();
    }

    class ListIterator implements Reverse.ListIterator
    {
        public Object next () {
        if (position == null) {
            position = first;
            return getFirst();
        } else {
            if (position.next == null) {
                throw new NoSuchElementException();
            }
            prevous = position;
            position = position.next;
            return position.data;
        }
    }

    public boolean hasNext() {
        if (position == null) {
            return first != null;
        } else {
            return position.next != null;
        }
    }

    public void add(Object element) {
        if (position == null) {
            addFirst(element);
        } else {
            Link newLink = new Link();
            newLink.data = element;
            newLink.next = position.next;
            position.next = newLink;
            position = newLink;
            prevous = null;
            size++;
        }
    }

    public void remove() {
        if (position == null) {
            removeFirst();
        } else {
            if (prevous == null) {
                throw new IllegalStateException();
            }
            prevous.next = position.next;
            position = prevous;
            size--;
        }
        prevous = null;
    }

    public void set(Object element) {
        if (position == null) {
            throw new IllegalStateException();
        }
        position.data = element;
        System.out.println(element);
    }

}
    private Link position;
    private Link prevous;

    public void reverse(){
        if ( first == null ) return;
        Link prev = first;
        Link current = first.next;
        first.next = null;
        while ( current != null ){
            Link next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }
}
