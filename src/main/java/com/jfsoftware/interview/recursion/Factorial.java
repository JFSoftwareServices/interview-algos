package com.jfsoftware.interview.recursion;

/**
 * Factorial of a number n is n * n-1 * n-2 * n-3.... n-n+1
 * e.g. factorial 5 = 5 * 4 * 3 * 2 * 1 = 120.
 * <p>
 * The general equation is n! = n * (n-1)!
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}