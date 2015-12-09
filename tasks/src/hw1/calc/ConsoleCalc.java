package hw1.calc;

import java.util.Scanner;

/*
* Написать калькулятор в виде консольного меню
	- сложение двух чисел
	- вычитание двух чисел
	- умножение двух чисел
	- деление двух чисел
* */

public class ConsoleCalc {

    private static double fistValue;
    private static double secondValue;
    private static boolean b = true;
    private static boolean b1 = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        String str;

        do {
            System.out.print("enter the first number: ");
            while (!scanner.hasNextDouble()) {      // проверка, что введено именно число
                scanner.next();
            }
            fistValue = scanner.nextDouble();
            System.out.print("enter the second number: ");
            while (!scanner.hasNextDouble()) {      // проверка, что введено именно число
                scanner.next();
            }
            secondValue = scanner.nextDouble();
            System.out.println("Please, that you want to select?" +
                    "\n1. + addition\n2. - subtraction\n3. * multiplication\n4. \\ division\n5. exit");
            System.out.print("enter your choice: ");
            do {
                str = scanner2.nextLine();
                switch (str) {
                    case "1":
                        System.out.println(add(fistValue, secondValue));
                        b1 = false;
                        break;
                    case "2":
                        System.out.println(sub(fistValue, secondValue));
                        b1 = false;
                        break;
                    case "3":
                        System.out.println(mult(fistValue, secondValue));
                        b1 = false;
                        break;
                    case "4":
                        System.out.println(div(fistValue, secondValue));
                        b1 = false;
                        break;
                    case "5":
                        b1 = false;
                        exit();
                        break;
                    default:
                        System.out.println("please, repeat.");
                }
            } while (b1);
            System.out.println("You want to repeat?\n1 - Yes\n2 - No");
            while (!scanner3.hasNextInt()) {
                scanner3.next();
            }
            double value = scanner3.nextDouble();
            if (value == 2) {
                b = false;
            }
        } while (b);
    }

    // addition
    private static String add(double value1, double value2) {
        return "result = " + (value1 + value2);
    }

    // subtraction
    private static String sub(double value1, double value2) {
        return "result = " +  (value1 - value2);
    }

    // multiplication
    private static String mult(double value1, double value2) {
        return "result = " +  (value1 * value2);
    }

    // division
    private static String div(double value1, double value2) {
        return "result = " +  (value1 / value2);
    }
    // exit from the program
    private final static void exit() {
        b = false;
        System.exit(100);
    }

}
