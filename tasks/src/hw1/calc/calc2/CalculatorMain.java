package hw1.calc.calc2;

public class CalculatorMain {

    public static void main(String[] args) {

        AbstractProcessor processor = new Processor();
        Calculator calculator = new Calculator(processor);

//        Scanner scan = new Scanner(System.in);
        calculator.inputSymbol('9');
        calculator.inputSymbol('-');
        calculator.inputSymbol('3');
        calculator.inputSymbol('=');
        System.out.println(calculator.processor.printResult());

    }

}
