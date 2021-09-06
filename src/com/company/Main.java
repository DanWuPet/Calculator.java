package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        startCalculator();

        }

    public static void startCalculator() {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int result;
        String operator = "";

        System.out.println("Welcome to the Calculator\n" +
                "It can do 4 things: Addition, Substraction, Division and Multiplication.");

        while(true){

            int operation;

            System.out.println("Choose what operator to use: \n" +
                    "1. Addition\n" +
                    "2. Substraction\n" +
                    "3. Division\n" +
                    "4. Multiplication\n");

            operation = input.nextInt();

            if (operation < 1 || operation > 4){
                System.out.println("Please choose one of the operations:");
            }

            System.out.println("Choose your first number.");
            number1 = input.nextInt();

            System.out.println("Choose your second number.");
            number2 = input.nextInt();

            switch (operation) {
                case 0:
                    result = number1 + number2;
                    operator = "Addition";
                    break;
                case 1:
                    result = number1 - number2;
                    operator = "Substraction";
                    break;
                case 2:
                    result = number1 / number2;
                    operator = "Division";
                    break;
                case 4:
                    result = number1 * number2;
                    operator = "Multiplication";
                    break;
                default:
                    result = 0;
            }

            System.out.println(operator + " result is: " + result);

        }
    }
}
