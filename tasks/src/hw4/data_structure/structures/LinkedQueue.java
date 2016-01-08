package hw4.data_structure.structures;

import hw4.data_structure.exceptions.NoSuchElementException;
import hw4.data_structure.interfaces.Queue;
import hw4.data_structure.node.Node;

import java.util.Iterator;

public class LinkedQueue<E> implements Queue<E>, Iterable<E> {

    private Node first;
    private Node last;
    private int size;

    public LinkedQueue() {
        clear();
        check();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (E element : this) {
            builder.append(element + " ");
        }
        return builder.toString();
    }

    @Override
    public void enqueue(E element) {
        Node oldNode = last;
        last = new Node();
        last.setElement(element);
        last.setNext(null);
        if (isEmpty()) {
            first = last;
        } else {
            oldNode.setNext(last);
        }
        size++;
        assert check();
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }
        E element = (E) first.getElement();
        first = first.getNext();
        size--;

        if (isEmpty()) {
            last = null;
        }
        assert check();
        return element;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public E getFirstElement() {
        if (isEmpty()) {
            throw new NoSuchElementException(getClass().getName() + ".getFirstElement");
        }
        return (E) first.getElement();
    }

    @Override
    public E getLastElement() {
        if (isEmpty()) {
            throw new NoSuchElementException(getClass().getName() + ".getLastElement");
        }
        return (E) last.getElement();
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private boolean check() {

        if (size < 0) {
            return false;
        } else if (size == 0) {
            if (first != null & last != null) {
                return false;
            }
        } else if (size == 1) {
            if (first == null || last == null) {
                return false;
            }
            if (first != last) {
                return false;
            }
            if (first.getNext() != null) {
                return false;
            }
        } else {
            if (first == null || last == null) {
                return false;
            }
            if (first == last) {
                return false;
            }
            if (first.getNext() == null) {
                return false;
            }
            if (last.getNext() != null) {
                return false;
            }

            int countOfNodes = 0;
            for (Node n = first; n != null && countOfNodes <= size; n = n.getNext()) {
                countOfNodes++;
            }
            if (countOfNodes != size) {
                return false;
            }

            Node lastNode = first;
            while (lastNode != null) {
                lastNode = lastNode.getNext();
            }
            if (last != lastNode) {
                return false;
            }
        }

        return true;

    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator<E> implements Iterator<E> {

        private Node temp = first;

        @Override
        public boolean hasNext() {
            return temp != null;
        }

        @Override
        public E next() {

            if (!hasNext()) {
                throw new NoSuchElementException(getClass().getName() + ".iterator.next");
            }

            E element = (E) temp.getElement();
            temp = temp.getNext();

            return element;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
