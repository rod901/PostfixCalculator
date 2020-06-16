package com.postfix.calculator;

import java.util.Stack;

public class Calculator {

    public void calculate(String[] input) {
        Stack stack = new Stack();

        for (String in:input) {
            if (in.equals("+") || in.equals("-") || in.equals("*") || in.equals("/")) {
                int right = (int) stack.pop();
                int left = (int) stack.pop();
                int value = 0;

                switch (in) {
                    case "+":
                        value = left + right;
                        break;
                    case "-":
                        value = left - right;
                        break;
                    case "*":
                        value = left * right;
                        break;
                    case "/":
                        value = left / right;
                        break;
                    default:
                        break;
                }
                stack.push(value);
            } else {
                    stack.push(Integer.parseInt(in));
            }
        }
        System.out.println(stack.pop());
    }
}
