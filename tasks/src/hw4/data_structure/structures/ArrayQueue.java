package hw4.data_structure.structures;

import hw4.data_structure.exceptions.UnderflowException;
import hw4.data_structure.interfaces.Queue;

public class ArrayQueue<E> implements Queue<E> {

    private static final int DEFAULT_CAPACITY = 10;     // default array size
    private E[] array;
    private int size;
    private int first;
    private int last;

    public ArrayQueue() {
        this.array = (E[]) new Object[DEFAULT_CAPACITY];
        clear();
    }

    public ArrayQueue(int size) {
        this.array = (E[]) new Object[size];
        clear();
    }

    public int getSize() {
        return size;
    }

    public E[] getArray() {
        return array;
    }

    @Override
    public void enqueue(E element) {
        if (size == array.length) {
            doubleQueue();
        }
        last = increment(last);
        array[last] = element;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new UnderflowException(getClass().getName() + ".dequeue");
        }
        size--;
        E element = array[first];
        first = increment(first);
        return element;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E getFirstElement() {
        if (isEmpty()) {
            throw new UnderflowException(getClass().getName() + ".getFirstElement");
        }
        return array[first];
    }

    @Override
    public E getLastElement() {
        if (isEmpty()) {
            throw new UnderflowException(getClass().getName() + ".getLastElement");
        }
        return array[last];
    }

    @Override
    public void clear() {
        size = 0;
        first = 0;
        last = -1;
    }

    private void doubleQueue() {
        E[] newArray = (E[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++, first = increment(first)) {
            newArray[i] = array[first];
        }
        array = newArray;
        first = 0;
        last = size - 1;
    }

    private int increment(int value) {
        if (++value == array.length) {
            value = 0;
        }
        return value;
    }

}
