package hw4.data_structure.interfaces;

public interface Queue<E> {

    void enqueue(E element);
    E dequeue();
    boolean isEmpty();
    E getFirstElement();
    E getLastElement();
    void clear();

}
