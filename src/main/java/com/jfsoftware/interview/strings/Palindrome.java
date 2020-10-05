package com.jfsoftware.interview.strings;

public class Palindrome {

    private static void isPalindrome(String word) {
        boolean palindrome = true;
        int start = 0;
        int end = word.length() - 1;
        while (end > start) {
            if (word.charAt(start) != word.charAt(end))
                palindrome = false;
            start++;
            end--;
        }
        if (palindrome)
            System.out.println("The word " + word + " is a palindrome");
        else
            System.out.println("The word " + word + " is not a palindrome");
    }

    public static void main(String[] args) {
        isPalindrome("madam");
        isPalindrome("racecar");
        isPalindrome("cake");
    }
}