package com.jfsoftware.interview.strings;

import java.util.Arrays;


/**
 * Two strings are called anagrams if they contain same set of characters but in different order.
 */
public class Anagram {

    private static void isAnagram(String s1, String s2) {
        boolean status;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        isAnagram("Keep", "Peek");
        isAnagram("Mary", "Army");
        isAnagram("Mary", "Mark");
    }
}