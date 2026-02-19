package com.stringutils.tests;

import com.stringutils.api.StringProcessor;
import com.stringutils.impl.StringProcessorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link StringProcessorImpl} class.
 * Follows IBM testing standards for functional verification.
 */
public class StringProcessorTest {

    private StringProcessor processor;

    @BeforeEach
    void setUp() {
        // Initialize the implementation before each test
        processor = new StringProcessorImpl();
    }

    @Test
    void testReverse() {
        assertEquals("olleh", processor.reverse("hello"));
        assertEquals("", processor.reverse(""));
        assertNull(processor.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(processor.isPalindrome("Racecar"));
        assertTrue(processor.isPalindrome("A man a plan a canal Panama"));
        assertFalse(processor.isPalindrome("hello"));
    }

    @Test
    void testCapitalizeWords() {
        assertEquals("Hello World", processor.capitalizeWords("hello world"));
        assertEquals("Java Programming", processor.capitalizeWords("JAVA programming"));
        assertEquals("", processor.capitalizeWords(""));
    }

    @Test
    void testCountVowels() {
        assertEquals(3, processor.countVowels("alphabet"));
        assertEquals(5, processor.countVowels("education"));
        assertEquals(0, processor.countVowels("bcdfgh"));
    }

    @Test
    void testTruncate() {
        assertEquals("Hello...", processor.truncate("Hello World", 5));
        assertEquals("Short", processor.truncate("Short", 10));
        assertEquals("", processor.truncate("", 5));
    }
}