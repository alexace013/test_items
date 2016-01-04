package hw4.data_structure.interfaces;

public interface Stack<E> {

    void push(E element);
    E peek();
    void pop();
    boolean isEmpty();

}
