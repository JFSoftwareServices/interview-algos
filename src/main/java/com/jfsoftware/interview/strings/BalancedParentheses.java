package com.jfsoftware.interview.strings;


import java.util.Stack;

/**
 * Given an expression string exp, write a program to examine whether the pairs and the
 * orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in exp.
 */
public class BalancedParentheses {

    private static void balancedParentheses(String s) {
        boolean status = true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.pop() != '[') {
                    status = false;
                }
            } else if (c == ')') {
                if (stack.pop() != '(') {
                    status = false;
                }

            } else if (c == '}') {
                if (stack.pop() != '{') {
                    status = false;
                }

            } else {
                status = stack.isEmpty(); //handles empty string case " "
            }
        }

        if (status) {
            System.out.println("Expression:" + s + " has balanced parentheses");
        } else {
            System.out.println("Expression:" + s + " does not have balanced parentheses");
        }
    }

    public static void main(String[] args) {
        balancedParentheses("[({})]");
        balancedParentheses("[(])");
        balancedParentheses(" ");
    }
}