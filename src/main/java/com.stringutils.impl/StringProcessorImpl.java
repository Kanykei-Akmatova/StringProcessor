package com.stringutils.impl;

import com.stringutils.api.StringProcessor;

/**
 * Standard implementation of the {@link StringProcessor} interface.
 */
public class StringProcessorImpl implements StringProcessor {

    @Override
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    @Override
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(reverse(clean));
    }

    @Override
    public String capitalizeWords(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    @Override
    public int countVowels(String input) {
        if (input == null) {
            return 0;
        }
        String vowels = "aeiou";
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String truncate(String input, int maxLength) {
        if (input == null || input.length() <= maxLength) {
            return input;
        }
        return input.substring(0, maxLength) + "...";
    }
}