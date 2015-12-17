package hw1.array;

/*
* Написать класс массив.
	- нахождение минимального +
	- нахождение максимального +
	- заполнение случайными числами в диапазоне +
	- красивый вывод на экран {2 4 5 6} +
	-* увеличить размер
	-* сделать сортировку массива
	-* метод для сравнения с другим массивом

* */

import java.util.Arrays;

public class MyArray {

    private int[] array;
    private int size = 0;

    public MyArray() {
        array = new int[10];
    }

    public MyArray(int size) {
        array = new int[size];
    }

    public MyArray(int[] array) {
        this.array = array;
    }

    public void addElement(int element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else if (size >= array.length) {
            System.err.println(new ArrayIndexOutOfBoundsException(array.length + 1));
        }
    }

    public int minimumValue() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int maximumValue() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public void random(int value) {
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * value);
            array[i] = random;
        }
    }

    public void selectionSort() {
        /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < array.length; i++) {
            /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = array[i];
            int minIdx = i;
            /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < array.length; j++) {
                // Если находим, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    minIdx = j;
                }
            }
            /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != minIdx) {
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
        }
    }

    public void bubbleSort() {
        /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void sort() {
        Arrays.sort(array);
    }

    public String asString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for (int i = 0; i < array.length - 1; i++) {
            builder.append(array[i] + ", ");
        }
        builder.append(array[array.length - 1]);
        builder.append("}");
        return builder.toString();
    }

    public int[] getArray() {
        return array;
    }

}
