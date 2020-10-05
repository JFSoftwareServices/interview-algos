package com.jfsoftware.interview.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

//    https://www.youtube.com/watch?v=zIHe2V5Py3U

    /**
     * @param nums - must be sorted
     */
    private static void removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        System.out.println("Array is " + Arrays.toString(nums));
        System.out.println("Length of array is: " + index);
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 6, 5, 9, 12, 0, 1, 3, 5, 9, 4};
        Arrays.sort(nums);
        removeDuplicates(nums);
    }
}