package hw1.calc.calc2;

public class Processor extends AbstractProcessor {

    @Override
    public void inputSymbol(char c) {
        if ('0' <= c && c <= '9') {
            int number = c - '0';
            setResult(getResult() + number);
        }
    }

}
