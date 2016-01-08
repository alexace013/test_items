package hw4.data_structure.structures;

import hw4.data_structure.exceptions.NoSuchElementException;
import hw4.data_structure.interfaces.Stack;
import hw4.data_structure.node.Node;

import java.util.Iterator;

public class LinkedStack<E> implements Stack<E>, Iterable<E> {

    private int size;
    private Node first;

    public LinkedStack() {
        first = null;
        size = 0;
        assert check();
    }

    public int getSize() {
        return size;
    }

    private boolean check() {

        if (size < 0) {
            return false;
        }

        if (size == 0) {
            if (first != null) {
                return false;
            }
        } else if (size == 1) {
            if (first == null) {
                return false;
            }
            if (first.getNext() != null) {
                return false;
            }
        } else {
            if (first == null) {
                return false;
            }
            if (first.getNext() == null) {
                return false;
            }
        }

        int countOfNodes = 0;

        for (Node node = first; node != null && countOfNodes <= size; node = node.getNext()) {
            countOfNodes++;
        }

        if (countOfNodes != size) {
            return false;
        }

        return true;

    }

    @Override
    public void push(E element) {
        Node oldNode = first;
        first = new Node();
        first.setElement(element);
        first.setNext(oldNode);
        size++;
        assert check();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return (E) first.getElement();
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        E element = (E) first.getElement();
        first = first.getNext();
        size--;
        assert check();
        return element;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E> {

        private Node node = first;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException(getClass().getName() + ".iterator.next");
            }
            E element = (E) node.getElement();
            node = node.getNext();
            return element;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

}
