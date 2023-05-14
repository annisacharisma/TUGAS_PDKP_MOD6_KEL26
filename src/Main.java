import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        char ulang;
        do {
            System.out.println("\n======= Calculator =======");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Scientific Calculator");
            System.out.println("3. Exit");
            System.out.print("Please choose a calculator: ");

            choice = scanner.nextInt();

            switch (choice) {
                case (1) -> {
                    System.out.println("\n=== Basic Calculator ===");
                    System.out.println("1. Add");
                    System.out.println("2. Subtract");
                    System.out.println("3. Multiply");
                    System.out.println("4. Divide");
                    System.out.print("Please choose an operation: ");
                    int BCOperation = scanner.nextInt();
                    if (BCOperation == 1) {
                        System.out.println("Please enter the numbers (enter x to finish): ");
                        double[] addNumbers = new double[100];
                        int addCount = 0;
                        while (scanner.hasNextDouble()) {
                            addNumbers[addCount] = scanner.nextDouble();
                            addCount++;
                        }
                        BasicCalculator basicCalc = new BasicCalculator(addNumbers);
                        double result = basicCalc.add();
                        System.out.println("The result of addition is: " + result);
                    } else if (BCOperation == 2) {
                        System.out.println("Please enter the numbers (enter x to finish): ");
                        double[] subNumbers = new double[100];
                        int subCount = 0;
                        while (scanner.hasNextDouble()) {
                            subNumbers[subCount] = scanner.nextDouble();
                            subCount++;
                        }
                        BasicCalculator basicCalc2 = new BasicCalculator(subNumbers);
                        double result2 = basicCalc2.subtract();
                        System.out.println("The result of substraction is: " + result2);
                    } else if (BCOperation == 3) {
                        System.out.print("Please enter the number of digits: ");
                        int multiplycount = scanner.nextInt();
                        double[] multiplyNumbers = new double[multiplycount];
                        for (int i = 0; i < multiplycount; i++) {
                            System.out.print("Please enter the number (" + (i + 1) + "): ");
                            multiplyNumbers[i] = scanner.nextDouble();
                        }
                        BasicCalculator basicCalc3 = new BasicCalculator(multiplyNumbers);
                        double result3 = basicCalc3.multiply(multiplyNumbers);
                        System.out.println("The result of multiplication is: " + result3);
                        System.out.print("\nPlease enter x to return to the main menu: ");
                    } else if (BCOperation == 4) {
                        System.out.print("Please enter the number of digits: ");
                        int dividecount = scanner.nextInt();
                        double[] divideNumbers = new double[dividecount];
                        for (int i = 0; i < dividecount; i++) {
                            System.out.print("Please enter the number (" + (i + 1) + "): ");
                            divideNumbers[i] = scanner.nextDouble();
                        }
                        BasicCalculator basicCalc4 = new BasicCalculator(divideNumbers);
                        double result4 = basicCalc4.divide();
                        System.out.println("The result of division is: " + result4);
                        System.out.print("\nPlease enter x to return to the main menu: ");
                    } else {
                        System.out.println("Invalid Input.");
                    }
                }
                case (2) -> {
                    System.out.println("\n=== Scientific Calculator ===");
                    System.out.println("1. Square root");
                    System.out.println("2. Exponentiation");
                    System.out.println("3. Factorial");
                    System.out.print("Please choose an operation: ");
                    int SCOperation = scanner.nextInt();
                    if (SCOperation == 1) {
                        System.out.print("Please enter the numbers: ");
                        double sqNumber = scanner.nextDouble();
                        ScientificCalculator scCalc1 = new ScientificCalculator(new double[]{sqNumber});
                        double result = scCalc1.squareRoot();
                        System.out.println("The square root of √" + sqNumber + " is: " + result);
                        System.out.print("\nPlease enter x to return to the main menu: ");
                    } else if (SCOperation == 2) {
                        System.out.print("Please enter the base number: ");
                        double number = scanner.nextDouble();
                        System.out.print("Please enter the exponent number: ");
                        double exponent = scanner.nextDouble();
                        double[] numbers = {number};
                        ScientificCalculator scCalc2 = new ScientificCalculator(numbers);
                        double result = scCalc2.exponentiation(exponent);
                        System.out.println("The exponent of " + number + "^" + exponent + " is: " + result);
                        System.out.print("\nPlease enter x to return to the main menu: ");
                    } else if (SCOperation == 3) {
                        System.out.print("Please enter the number: ");
                        double factorialNumbers = scanner.nextDouble();
                        ScientificCalculator scCalc3 = new ScientificCalculator(new double[]{factorialNumbers});
                        double result3 = scCalc3.factorial();
                        System.out.println("The Factorial of " + factorialNumbers + " is: " + result3);
                        System.out.print("\nPlease enter x to return to the main menu: ");
                    } else {
                        System.out.println("Invalid Input.");
                    }
                }
                case (3) -> {
                    System.out.println("Exiting program...");
                    System.exit(0);
                }
            }
            ulang = scanner.next().charAt(0);
        } while (ulang != ' ');
    }
}
