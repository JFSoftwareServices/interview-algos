package com.jfsoftware.interview.integers;

import java.util.Arrays;

/**
 * Find the pairs of numbers in an array who's sum matches the given number
 */
public class PairInArrayWithGivenSum {

    private static void printPairThatMatchesNumber(int[] numbers, int k) {
        Arrays.sort(numbers);
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == k) {
                System.out.printf("(%d, %d) %n", numbers[start], numbers[end]);
                start++;
                end--;
            } else if (sum < k) {
                start++;
            } else {
                end--;
            }
        }
    }

    public static void main(String[] args) {
        printPairThatMatchesNumber(new int[]{3, 0, 45, 4, 44, -1, 48, -2, 1}, 46);
    }
}