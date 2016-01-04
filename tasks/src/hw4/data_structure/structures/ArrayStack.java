package hw4.data_structure.structures;

import hw4.data_structure.exceptions.StackException;
import hw4.data_structure.interfaces.Stack;

public class ArrayStack<E> implements Stack {

    private static final int DEFAULT_CAPACITY = 10;
    private int first;
    private E[] array;

    public ArrayStack() {
        this.array = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayStack(int size) {
        if (size <= 0) {
            throw new StackException("stack's size must be positive");
        }
        this.array = (E[]) new Object[size];
        first = -1;
    }

    @Override
    public void push(Object element) {
        if (first == array.length) {
            throw new StackException("stack's size is overflow");
        }
        first++;
        array[first] = (E) element;
    }

    @Override
    public E peek() {
        if (first == -1) {
            throw new StackException("stack is empty");
        }
        return array[first];
    }

    @Override
    public void pop() {
        if (first == -1) {
            throw new StackException("stack is empty");
        }
        first--;
    }

    @Override
    public boolean isEmpty() {
        return first == -1;
    }

}
