package com.tiy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        double operand1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter a second number");
        double operand2 = Double.parseDouble(scanner.nextLine());

        double sum = operand1 + operand2;
        double divide = operand1 / operand2;
        double multiply = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResults(sum, divide, multiply, remainder);
    }


    private static void showResults(double sum, double quotient, double product, double remainder) {
        System.out.println("The sum is " + sum);
        System.out.println("The quotient is " + quotient);
        System.out.println("The product is " + product);
        System.out.println("The remainder is " + remainder);
    }
}
