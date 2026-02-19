package com.stringutils.api;

/**
 * The <code>StringProcessor</code> interface defines the contract for
 * string manipulation utilities within the library.
 * * @version 1.0.0
 * @author Your Name
 */
public interface StringProcessor {

    /**
     * Reverses the character sequence of the input string.
     * * @param input the string to be reversed
     * @return the reversed string, or null if input is null
     */
    String reverse(String input);

    /**
     * Determines if the input string is a palindrome, ignoring case and whitespace.
     * * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    boolean isPalindrome(String input);

    /**
     * Capitalizes the first letter of every word in the string.
     * * @param input the string to format
     * @return the capitalized string
     */
    String capitalizeWords(String input);

    /**
     * Counts the total number of vowels (a, e, i, o, u) in the string.
     * * @param input the string to analyze
     * @return the count of vowels
     */
    int countVowels(String input);

    /**
     * Shortens a string to a specific length and appends an ellipsis.
     * * @param input the string to truncate
     * @param maxLength the maximum number of characters allowed
     * @return the truncated string
     */
    String truncate(String input, int maxLength);
}