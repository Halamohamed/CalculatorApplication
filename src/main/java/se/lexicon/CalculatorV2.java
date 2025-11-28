package se.lexicon;

import java.util.List;
import java.util.Scanner;

public class CalculatorV2 {
    public double addition(double... numbers) {
        double sum = 0;
        for (double number : numbers) sum += number;
        return sum;
    }

    public double subtraction(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) result -= numbers[i];
        return result;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
        return a / b;
    }

    void main(){
        CalculatorV2 calculator = new CalculatorV2();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose operation (+, -, *, /) or type 'exit' to quit:");
            String operator = scanner.next();

            if (operator.equalsIgnoreCase("exit")) {
                running = false;
                break;
            }

            try {
                System.out.println("Enter first number:");
                double num1 = scanner.nextDouble();

                double result = 0;

                if (operator.equals("+") || operator.equals("-")) {
                    System.out.println("Enter more numbers (type 'done' to finish):");
                    List<Double> numbers = new java.util.ArrayList<>();
                    numbers.add(num1);

                    while (scanner.hasNextDouble()) {
                        numbers.add(scanner.nextDouble());
                    }
                    scanner.next(); // consume "done"

                    double[] arr = numbers.stream().mapToDouble(Double::doubleValue).toArray();
                    result = operator.equals("+") ? calculator.addition(arr) : calculator.subtraction(arr);

                } else {
                    System.out.println("Enter second number:");
                    double num2 = scanner.nextDouble();

                    switch (operator) {
                        case "*":
                            result = calculator.multiplication(num1, num2);
                            break;
                        case "/":
                            result = calculator.division(num1, num2);
                            break;
                        default:
                            System.out.println("Invalid operator.");
                            continue;
                    }
                }

                System.out.println("Result: " + result);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // clear buffer
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }
}

