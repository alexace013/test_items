package draft;

import java.util.Scanner;

public class ConsoleCalc001 {

    private static double firstValue;
    private static double secondValue;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        firstValue = scan.nextDouble();
        System.out.print("Enter the second number: ");
        secondValue = scan.nextDouble();
        System.out
                .println("Select one of the following (+) - addition, (-) - subtraction, (*) - multiplication, (/) - division");
        boolean d = true;
        while (d) {
            String str = scan.next();

            if (str.equals("+")) {
                System.out.println(add(firstValue, secondValue));
                d = false;

            } else if (str.equals("-")) {
                System.out.println(sub(firstValue, secondValue));
                d = false;

            } else if (str.equals("*")) {
                System.out.println(mul(firstValue, secondValue));
                d = false;

            } else if (str.equals("/")) {
                System.out.println(div(firstValue, secondValue));
                d = false;

            } else {
                System.out.println("Try again.");
            }
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
