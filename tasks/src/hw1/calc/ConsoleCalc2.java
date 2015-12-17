package hw1.calc;

import java.util.Scanner;

public class ConsoleCalc2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        showMenu();
        int selectNumber = selectFromMenu(scanner);
        boolean b = false;
        if (selectNumber == 1) {
            do {
                System.out.print("input first number: ");
                double value1 = inputValue(scanner);
                System.out.print("input second number: ");
                double value2 = inputValue(scanner);
                System.out.print("select your operation(+, -, *, /): ");
                char c = inputChar(scanner);
                System.out.println(selectOperation(value1, value2, c));
                System.out.println("repeat math operation?\n1. - Yes\n2. - No");
                int answer = selectFromMenu(scanner);
                if (answer == 1) {
                    b = true;
                } else {
                    b = false;
                }
            } while (b);

        } else if (selectNumber == 2) {
            System.out.println("exit from program");
            System.exit(0);
        }


    }

    public static double selectOperation(double value1, double value2, char operand) {

        double result = 0;

        switch (operand) {
            case '+':
                result = add(value1, value2);
                break;
            case '-':
                result = sub(value1, value2);
                break;
            case '*':
                result = mult(value1, value2);
                break;
            case '/':
                result = div(value1, value2);
                break;
            default:
                System.err.println("Wrong operand");
        }
        return result;
    }

    public static char inputChar(Scanner scanner) {
        while (!scanner.hasNext()) {
            scanner.next();
        }
        return scanner.next().charAt(0);
    }

    public static int selectFromMenu(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static double inputValue(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public static void showMenu() {
        System.out.print("1. Select operation\n2. Exit program\n");
    }

    // addition
    private static double add(double value1, double value2) {
        return value1 + value2;
    }

    // subtraction
    private static double sub(double value1, double value2) {
        return value1 - value2;
    }

    // multiplication
    private static double mult(double value1, double value2) {
        return value1 * value2;
    }

    // division
    private static double div(double value1, double value2) {
        return value1 / value2;
    }

}
