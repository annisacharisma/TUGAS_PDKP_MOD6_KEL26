public class ScientificCalculator extends Calculator {
    public ScientificCalculator(double[] numbers) {
        super(numbers);
    }
    public double add() {
        return 0;
    }
    public double subtract() {
        return 0;
    }
    public double multiply(double[] numbers) {
        return 0;
    }
    public double divide() {
        return 0;
    }
    public double squareRoot() {
        double[] numbers = getNumbers();
        return Math.sqrt(numbers[0]);
    }

    public double exponentiation(double exponent) {
        double[] numbers = getNumbers();
        return Math.pow(numbers[0], exponent);
    }

    public double factorial() {
        double[] numbers = getNumbers();
        double result = 1;
        for (int i = 1; i <= numbers[0]; i++) {
            result *= i;
        }
        return result;
    }
}
