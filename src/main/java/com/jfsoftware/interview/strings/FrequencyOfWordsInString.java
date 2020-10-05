package com.jfsoftware.interview.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * The frequency of words in a sentence.
 */
public class FrequencyOfWordsInString {

    private static void frequencyOfWords(String s) {
        Map<String, Integer> frequencies = new HashMap<>();
        String[] words = s.split("\\s");
        for (String word : words) {
            Integer count = frequencies.get(word);
            if (count == null) {
                count = 0;
            }
            frequencies.put(word, count + 1);
        }
        System.out.println(frequencies);
    }

    public static void main(String[] args) {
        frequencyOfWords("one two five one two three five four");
    }
}