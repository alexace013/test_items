package hw1.calc.calc2;

import java.util.regex.Pattern;

public class Calculator {

    AbstractProcessor processor;
    public static final Pattern pattern = Pattern.compile("[0-9]");

    public Calculator(AbstractProcessor processor) {
        this.processor = processor;
    }

    public void inputSymbol(char c) {
        if (c == pattern.flags()) {
            processor.setTemp(c);
        } else if (c == '+' || c == '-' || c == '*' || c == '/' || c == 'e' || c == '\u0045') {
            switch (c) {
                case '+':
                    add(processor.getTemp(), processor.getResult());
                    break;
                case '-':
                    sub(processor.getTemp(), processor.getResult());
                    break;
                case '*':
                    mult(processor.getTemp(), processor.getResult());
                    break;
                case '/':
                    div(processor.getTemp(), processor.getResult());
                    break;
                case 'e':
                    System.exit(0);
                    break;
                case '\u0045':
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR");
            }
        }
        processor.inputSymbol(c);
//        processor.printResult();
    }
    // addition
    public void add(double value1, double value2) {
        processor.setResult(value1 + value2);
    }
    // subtraction
    public void sub(double value1, double value2) {
        processor.setResult(value1 - value2);
    }
    // multiplication
    public void mult(double value1, double value2) {
        processor.setResult(value1 * value2);
    }
    // division
    public void div(double value1, double value2) {
        processor.setResult(value1 / value2);
    }

}
