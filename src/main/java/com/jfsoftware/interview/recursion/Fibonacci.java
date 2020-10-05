package com.jfsoftware.interview.recursion;

/**
 * Fibonacci sequence 0, 1, 1, 2, 3, 5, 8, 13, 21,...
 * <p>
 * 1st Fibonacci number is 0, 2nd Fibonacci number is 1, 3rd Number is 1st Fibonacci + 2nd Fibonacci = 1
 * 4th Fibonacci number is 3rd Fibonacci + 2nd Fibonacci = 1 + 1 =2.
 * <p>
 * General form nth Fibonacci number Fibonacci (n-2) + Fibonacci (n-1)
 */

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(0)); // prints the 5th Fibonacci number
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 0)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}