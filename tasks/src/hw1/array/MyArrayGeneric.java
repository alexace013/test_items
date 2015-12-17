package hw1.array;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *  Написать класс массив.
 - нахождение минимального
 - нахождение максимального
 - заполнение случайными числами в диапазоне
 - красивый вывод на экран {2 4 5 6}
 -* увеличить размер
 -* сделать сортировку массива
 -* метод для сравнения с другим массивом
 */
public class MyArrayGeneric<E> {

    private E[] array;

    public MyArrayGeneric(int value) {
        array = (E[]) new Object[value];
    }

    public E getElement(int i) {
        return array[i];
    }

    public void setElement(int index, E value) {
        array[index] = value;
    }

    public int length() {
        return array.length;
    }

    private class MyIterator implements Iterator<E> {

        int index;

        public MyIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public E next() {
            E temp;
            if (!hasNext()) {
                throw new NoSuchElementException("next element no available");
            } else {
                temp = array[index];
                index++;
            }
            return temp;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove operation not supported");
        }
    }

    public Iterator<E> iterator() {
        return new MyIterator();
    }

}
