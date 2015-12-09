package hw1.calc.calc2;

public abstract class AbstractProcessor implements Processorable {

    private double result;
    private double temp;

    @Override
    public double printResult() {
        return getResult();
    }

    protected void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }


}
