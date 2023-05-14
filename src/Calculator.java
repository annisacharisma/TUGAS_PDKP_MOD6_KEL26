public abstract class Calculator {
    private double[] numbers;

    public Calculator(double[] numbers) {
        this.numbers = numbers;
    }

    public double[] getNumbers() {
        return numbers;
    }

    public void setNumbers(double[] numbers) {
        this.numbers = numbers;
    }

    public abstract double squareRoot();

    public abstract double exponentiation(double exponent);

    public abstract double factorial();

    public abstract double add();

    public abstract double subtract();

    public abstract double multiply(double[] numbers);

    public abstract double divide();

    public void clear() {
        numbers = new double[0];
    }
}
