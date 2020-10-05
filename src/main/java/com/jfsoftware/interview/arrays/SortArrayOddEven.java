package com.jfsoftware.interview.arrays;

import java.util.Arrays;

/**
 * Write a method (not a program) in Java Programming Language that will move all even numbers on
 * the first half and odd numbers to the second half in an integer array. E.g. Input {3,8,12,5,9,21,6,10};
 * Output = {12,8,6,10,3,5,9,21}
 * The method should take integer array and move items in the same array (do not create another array)
 * The numbers may be in different order than original array. This is algorithm test, so try to give as efficient
 * algorithm as you can (possibly linear O9n) algorithm). Avoid using built in functions/API
 */
public class SortArrayOddEven {
    private static void evenOdd(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        int temp;

        while (end > start) {
            if (numbers[start] % 2 != 0 && numbers[end] % 2 == 0) {
                //swap
                temp = numbers[end];
                numbers[end] = numbers[start];
                numbers[start] = temp;
                start++;
                end--;
            } else {
                if (numbers[start] % 2 == 0)
                    start++;
                if (numbers[end] % 2 == 1)
                    end--;
            }
        }
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{3, 8, 12, 5, 9, 21, 6, 10};
        evenOdd(numbers);
    }
}
