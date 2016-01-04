package hw4.data_structure.test_structures;

import hw4.data_structure.structures.ArrayStack;

public class ArrayStackTest {

    public static void main(String[] args) {

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        arrayStack.push(5);
        arrayStack.push(50);
        arrayStack.push(500);
        arrayStack.push(5000);
        arrayStack.push(50000);

        System.out.println(arrayStack.peek());

        arrayStack.pop();

        System.out.println(arrayStack.peek());

    }

}
