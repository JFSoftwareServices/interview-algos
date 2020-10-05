package com.jfsoftware.interview.integers;


/**
 * In an array of numbers 1 to 100, say, find the missing number
 */
public class MissingNumberInArray {

    private static void findMissingNumber(int[] nums, int n) {
        int expectedSum = n * (n + 1) / 2; // this is the formula for the sum from 1 to n. 100 *
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        System.out.printf("Missing number is: %s", expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] numbers = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
                14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
                36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46,
                47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57,
                58, 59, 60, 62, 63, 64, 65, 66, 67, 68,
                69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
                80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100}; // 61 is missing number
        findMissingNumber(numbers, 100);
    }
}