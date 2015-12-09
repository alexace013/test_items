package hw1.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyArrayMain {

    private static MyArray<Integer> array;

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input array size: ");
        String input = null;
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int value = Integer.parseInt(input);
        array = new MyArray<>(value);
        random();
        printArray();
        System.out.println("\nminimum: " + minimumValue());
        System.out.println("maximum: " + maximumValue());

    }

    public static void random() {
        for (int i = 0; i < array.length(); i++) {
            int random = (int)(Math.random() * 100);
            array.setElement(i, random);
        }
    }

    public static int minimumValue() {
        int min = array.getElement(0);
        for (int i = 0; i < array.length(); i++) {
            if (min > array.getElement(i)) {
                min = array.getElement(i);
            }
        }
        return min;
    }

    public static int maximumValue() {
        int max = array.getElement(0);
        for (int i = 0; i < array.length(); i++) {
            if (max < array.getElement(i)) {
                max = array.getElement(i);
            }
        }
        return max;
    }

    public static void printArray() {
        for (int i = 0; i < array.length(); i++) {
            System.out.print(array.getElement(i) + " ");
        }
    }

}
