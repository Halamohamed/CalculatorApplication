package se.lexicon;

import java.util.Scanner;


public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println(String.format("Hello and welcome!"));
        Calculator calculator = new Calculator();


        // Stores two numbers
        double num1 = 0, num2 = 0;

        boolean running = true;

        while (running) {
            int number = 0;
            int op = calculator.menu(number);
            if (op == 5) {
                running = false;
                break;
            }

            int option = op;     //scanner.next().charAt(0);
            double result = 0;

            switch (option) {
                // case to add two numbers
                case 1:
                    result = calculator.addition(num1, num2);
                    break;

                // case to subtract two numbers
                case 2:
                    result = calculator.substraction(num1, num2);
                    break;

                // case to multiply two numbers
                case 3:
                    result = calculator.multiplication(num1, num2);
                    break;

                // case to divide two numbers
                case 4:
                    result = calculator.division(num1, num2);
                    break;

                default:
                    System.out.println("You enter wrong input");
            }


            calculator.printResult(op, result);
            IO.println("would you want to calculate more ! (yes/no)");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("no")) {
                running = false;
                break;
            }

        }
    }


}

