package se.lexicon;

import java.util.Scanner;


public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        IO.println(String.format("Hello and welcome!"));
        Calculator calculator = new Calculator();


        // Stores two numbers
        double num1, num2;

        boolean running = true;

        while (running) {
            // Take input from the user
            System.out.println("Enter the first number:");

            // Take the inputs
            num1 = scanner.nextDouble();
            System.out.println("Enter the second number:");
            num2 = scanner.nextDouble();

            // Take operator from the user
            System.out.println("Enter the operator (+,-,*,/):");

            char option = scanner.next().charAt(0);
            double result = 0;

            switch (option) {
                // case to add two numbers
                case '+':
                    result = num1 + num2;
                    break;

                // case to subtract two numbers
                case '-':
                    result = num1 - num2;
                    break;

                // case to multiply two numbers
                case '*':
                    result = num1 * num2;
                    break;

                // case to divide two numbers
                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("You enter wrong input");
            }

            System.out.println("The final result:");
            System.out.println();

            // print the final result
            System.out.println(num1 + " " + option + " " + num2
                    + " = " + result);
            IO.println("would you want to calculate more ! (yes/no)");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("no")){
                running = false;
                break;
            }

        }
    }


    }

