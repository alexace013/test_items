package hw4.data_structure.test_structures;

import hw4.data_structure.structures.LinkedQueue;

public class LinkedQueueTest {

    public static void main(String[] args) {

        LinkedQueue<String> linkedQueue = new LinkedQueue<>();

        linkedQueue.enqueue("first");
        linkedQueue.enqueue("second");
        linkedQueue.enqueue("third");

        System.out.println("first element: " + linkedQueue.getFirstElement());
        System.out.println("last element: " + linkedQueue.getLastElement());
        System.out.println("all elements: " + linkedQueue.toString());
        System.out.println("size = " + linkedQueue.getSize());

        linkedQueue.dequeue();
        linkedQueue.dequeue();

        System.out.println("first element: " + linkedQueue.getFirstElement());
        System.out.println("last element: " + linkedQueue.getLastElement());
        System.out.println("all elements: " + linkedQueue.toString());
        System.out.println("size = " + linkedQueue.getSize());

    }

}
