package hw4.data_structure.test_structures;

import hw4.data_structure.structures.LinkedStack;

public class LinkedStackTest {

    public static void main(String[] args) {

        LinkedStack<Double> linkedStack = new LinkedStack<>();

        linkedStack.push(8.78);
        linkedStack.push(9.93);
        linkedStack.push(7.11);

        for (Double d : linkedStack) {
            System.out.print(d + " ");
        }

        System.out.println("\n" + linkedStack.peek());

        double d = linkedStack.pop();

        System.out.println(d);
        System.out.println(linkedStack.peek());

    }

}
