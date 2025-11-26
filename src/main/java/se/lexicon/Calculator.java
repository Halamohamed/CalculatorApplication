package se.lexicon;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public int menu(int option) {

        IO.println("Welcome to Calculator");
        IO.println("choose an option: ");
        IO.println("1- Addition: ");
        IO.println("2- Substraction");
        IO.println("3- Multiplication: ");
        IO.println("4- Division");
        IO.println("5- Exit");
        option = scanner.nextInt();
        return option;
    }

    public double addition(double number1, double number2) {

        IO.println("Enter First number: ");
        number1 = scanner.nextDouble();
        IO.println("Enter Second number: ");
        number2 = scanner.nextDouble();
        double result = number1 + number2;
        IO.println("Result of " + number1 + " + " + number2 + " = " + result);
        return result;
    }

    public double substraction(double number1, double number2) {

        IO.println("Enter First number: ");
        number1 = scanner.nextDouble();
        IO.println("Enter Second number: ");
        number2 = scanner.nextDouble();
        double result = number1 - number2;
        IO.println("Result of " + number1 + " - " + number2 + " = " + result);

        return result;
    }

    public double multiplication(double number1, double number2) {

        IO.println("Enter First number: ");
        number1 = scanner.nextDouble();
        IO.println("Enter Second number: ");
        number2 = scanner.nextDouble();
        double result = number1 * number2;
        IO.println("Result of " + number1 + " * " + number2 + " = " + result);

        return result;
    }

    public double division(double number1, double number2) {

        IO.println("Enter First number: ");
        number1 = scanner.nextDouble();
        IO.println("Enter Second number: ");
        number2 = scanner.nextDouble();
        double result = number1 / number2;
        IO.println("Result of " + number1 + " / " + number2 + " = " + result);

        return result;
    }


    public void printResult(int option, double result) {
        if (option < 5) {
            IO.println(result);
        } else {
            IO.println("invalid number");
        }

    }
}
