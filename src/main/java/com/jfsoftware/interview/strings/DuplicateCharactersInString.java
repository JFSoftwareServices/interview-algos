package com.jfsoftware.interview.strings;

/**
 * Report, true or false, if a string contains duplicate characters
 */
public class DuplicateCharactersInString {
    private static void containsDuplicates(String s) {
        boolean duplicates = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    duplicates = true;
                }
            }
        }
        if (duplicates)
            System.out.println(s + " contains duplicates");
        else
            System.out.println(s + " doesn't contain duplicates");
    }

    public static void main(String[] args) {
        containsDuplicates("abcdefga");
        containsDuplicates("abcdef");
    }
}