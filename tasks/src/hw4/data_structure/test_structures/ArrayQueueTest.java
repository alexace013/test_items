package hw4.data_structure.test_structures;

import hw4.data_structure.structures.ArrayQueue;

import java.util.Arrays;

public class ArrayQueueTest {

    public static void main(String[] args) {

        ArrayQueue<String> arrayQueue = new ArrayQueue<>();

        arrayQueue.enqueue("first");
        arrayQueue.enqueue("second");
        arrayQueue.enqueue("third");

        System.out.println("arrayQueue.getFirstElement() =  " + arrayQueue.getFirstElement());
        System.out.println("arrayQueue.getSize() = " + arrayQueue.getSize());
        System.out.println(Arrays.toString(arrayQueue.getArray()));

        ArrayQueue<Integer> arrayQueue1 = new ArrayQueue<>(15);

        for (int i = 0; i < 15; i++) {
            int rand = (int) (Math.random() * 100);
            arrayQueue1.enqueue(rand);
        }

        System.out.println(Arrays.toString(arrayQueue1.getArray()));

        ArrayQueue<Character> arrayQueue2 = new ArrayQueue<>();
//        System.out.println(arrayQueue2.getFirstElement());

    }

}
