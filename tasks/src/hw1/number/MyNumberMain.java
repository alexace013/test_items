package hw1.number;

public class MyNumberMain {

    public static void main(String[] args) {

        MyNumber number = new MyNumber(5.0);
        System.out.println("сложение = " + number.addition(7.3));
        System.out.println("вычитание = " + number.subtraction(3.9));
        System.out.println("уможение = " + number.multiplication(5.0));
        System.out.println("деление = " + number.division(2.0));
        System.out.println("число в степени = " + number.involution(3));
        System.out.println("факториал = " + number.factorial());
        System.out.println("факториал = " + number.factorial(8));
        System.out.println("остаток от деления = " + number.remainderOfDivision(3));
        System.out.println("сравнение двух чисел: " + number.comparingToNumbers(8.0));
        number.setNumber(9.5);
        System.out.println("сравнение двух чисел: " + number.comparingToNumbers(7.9));

        MyNumber number2 = new MyNumber(9.0);
        System.out.println("сравнение двух чисел (int значение): " + number.compareToNumbers(number2));

    }

}
