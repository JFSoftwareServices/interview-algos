package com.jfsoftware.interview.strings;

/**
 * The count of occurrences of a character in a string
 */
public class OccurrenceOfCharacterInString {
    private static void countOccurrences(String word, char c) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        System.out.printf("There are %s occurrences of %s in %s", count, c, word);
    }

    public static void main(String[] args) {
        countOccurrences("aAmearicanoaoaaAaa", 'a');
    }
}