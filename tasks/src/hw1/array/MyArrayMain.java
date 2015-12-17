package hw1.array;

/**
 * Created by alexander on 17.12.15.
 */
public class MyArrayMain {

    public static void main(String[] args) {

        MyArray array1 = new MyArray();

        array1.addElement(5);
        array1.addElement(10);
        array1.addElement(20);
        array1.addElement(30);
        array1.addElement(40);
        array1.addElement(50);
        array1.addElement(60);
        array1.addElement(70);
        array1.addElement(80);
        array1.addElement(90);
//        array1.addElement(100);
        System.out.println("array1: " + array1.asString());
        System.out.println("max = " + array1.maximumValue() + "\nmin = " + array1.minimumValue());
        System.out.println("array1 size: " + array1.arraySize());
        System.out.println("=============================");
        MyArray array2 = new MyArray(3);
        array2.addElement(7);
        array2.addElement(8);
        array2.addElement(9);
        System.out.println("array2: " + array2.asString());
        System.out.println("=============================");
        MyArray array3 = new MyArray(50);
        array3.random(100);
        System.out.println("array3: " + array3.asString());
        array3.bubbleSort();
        System.out.println("array3 - bubble sort: " + array3.asString());
        System.out.println("=============================");
        MyArray array4 = new MyArray();
        array4.random(15);
        System.out.println("array4: " + array4.asString());
        array4.selectionSort();
        System.out.print("array4 - selection sort: " + array4.asString());
        System.out.println("\n=============================");
        MyArray array5 = new MyArray(17);
        array5.random(87);
        System.out.println("array5: " + array5.asString());
        array5.sort();
        System.out.println("Arrays.sort(int[] array) - array5: " + array5.asString());
        System.out.println("=============================");
        MyArray array6 = new MyArray();
        System.out.println("array size: " + array6.arraySize());
        array6.ensureCapacity(73);
        System.out.println("array size: " + array6.arraySize());
        System.out.println("=============================");
        MyArray array7 = new MyArray();
        array7.random(18);
        MyArray array8 = new MyArray();
        array8.random(19);
        System.out.println("array7 equals with array8: " + array7.equalsArray(array8.getArray()));
        MyArray array9 = new MyArray(3);
        array9.addElement(4);
        array9.addElement(2);
        array9.addElement(0);
        MyArray array10 = new MyArray(3);
        array10.addElement(4);
        array10.addElement(2);
        array10.addElement(0);
        System.out.println("array10 equals with array9: " + array10.equalsArray(array9.getArray()));
//        System.out.println(Arrays.equals(array9.getArray(), array10.getArray()));

    }

}
