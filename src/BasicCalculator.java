public class BasicCalculator extends Calculator {
    public BasicCalculator(double[] numbers) {
        super(numbers);
    }

    public double squareRoot() {
        return 0;
    }

    public double exponentiation(double exponen) {
        return 0;
    }


    public double factorial() {
        return 0;
    }


    public double add() {
        double[] numbers = getNumbers();
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    public double subtract() {
        double[] numbers = getNumbers();
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public double multiply(double[] numbers) {
        double result = 1;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }

    public double divide() throws ArithmeticException {
        double[] numbers = getNumbers();
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("Division by zero is not possible.");
            }
            result /= numbers[i];
        }
        return result;
    }
}
