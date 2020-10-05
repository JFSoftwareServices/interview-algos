package com.jfsoftware.interview.arrays;

public class LargestSmallestInArray {

    /**
     * Method to find largets and smallest number in an unsorted int array
     */
    private static void findLargestAndSmallestNumber(int[] numbers) {
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number > largest)
                largest = number;
            else if (number < smallest)
                smallest = number;
        }
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);
    }

    public static void main(String[] args) {
        findLargestAndSmallestNumber(new int[]{2, 51, 89, 2080, 4, -6, 3, -1045});
    }
}