package hw1.number;

/**
 * Написать класс число.
 - сложение
 - вычитание
 - умножение
 - деление
 - возведение в степень
 - вычисление факториала
 - вычисление остатка от деления
 - метод который сравнивает два числа
 */
public class MyNumber {

    private double value;

    public MyNumber() {
        value = 0.0d;
    }

    public MyNumber(double value) {
        this.value = value;
    }

    public void setNumber(double value) {
        this.value = value;
    }

    public double getNumber() {
        return value;
    }

    // сложение
    public MyNumber addition(double number) {
        return new MyNumber(getNumber() + number);
    }

    // вычитание
    public MyNumber subtraction(double number) {
        return new MyNumber(getNumber() - number);
    }

    // умножение
    public MyNumber multiplication(double number) {
        return new MyNumber(getNumber() * number);
    }

    // деление
    public MyNumber division(double number) {
        return new MyNumber(getNumber() / number);
    }

    // возведение в степень
    public MyNumber involution(int number) {
        return new MyNumber(Math.pow(getNumber(), number));
    }

    // вычисление факториала - 1
    public MyNumber factorial() {
        if (getNumber() < 0) {
            throw new IllegalArgumentException("please, enter positive number.");
        }
        int factorial = 1;
        if (getNumber() >= 0) {
            for (int i = 2; i <= getNumber(); i++) {
                factorial *= i;
            }
        }
        return new MyNumber(factorial);
    }

    // вычисление факториала - 2
    public MyNumber factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("please, enter positive number.");
        }
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return new MyNumber(factorial);
    }

    // вычисление остатка от деления
    public MyNumber remainderOfDivision(double number) {
        return new MyNumber(this.getNumber() % number);
    }

    // метод, который сравнивает два числа
    public String comparingToNumbers(double number2) {
        if (getNumber() > number2) {
            return new String(getNumber() + " > " + number2);
        } else if(getNumber() < number2) {
            return new String(getNumber() + " < " + number2);
        } else {
            return new String("numbers the equal");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(getNumber());
    }

}
