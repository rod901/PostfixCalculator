package com.postfix.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean isDone = false;

        while (!isDone) {
            System.out.println("Enter numbers and operators for Postfix Calculator: ");
            String input = new Scanner(System.in).nextLine();
            String[] postfixArray = input.split("");
            calculator.calculate(postfixArray);

            System.out.println("Continue? Y/N");
            input = new Scanner(System.in).nextLine().toUpperCase();
            switch (input) {
                case "Y":
                    isDone = false;
                    break;
                case "N":
                    isDone = true;
                    break;
            }
        }
    }
}
