package com.jfsoftware.interview.integers;


/**
 * Reverse a number without using data structures
 */
public class ReverseNumber {

    public static void main(String[] args) {
        reverse(12345);
    }

    private static void reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversed);
    }
}