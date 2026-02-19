# StringProcessor Utility Library

## Overview
The `StringProcessor` library is a modular Java utility designed to simplify common string manipulation tasks. Developed following the **IBM Java Style Guidelines**, this library provides robust, well-documented, and unit-tested methods for enterprise-level applications.

---

## Course Information
* **Course:** 26W-CST8411-Information Systems Development and Deployment
* **Assignment:** Assignment 1 - Deployable JAR
---

## Features
The library exposes the `StringProcessor` interface with the following five core functions:

1. **Reverse:** Reverses a string sequence.
2. **Palindrome Check:** Validates if a string is a palindrome (case-insensitive).
3. **Word Capitalization:** Converts strings to title case.
4. **Vowel Counter:** Returns the total count of vowels in a string.
5. **Truncate:** Shortens strings to a specific length and appends an ellipsis.

---

## Installation

### Prerequisites
* Java Development Kit (JDK) 19 or higher.

### Manual JAR Integration
1. Download the `StringProcessor.jar` from the **Releases** section of this repository.
2. In your IDE (IntelliJ/Eclipse), go to **Project Structure** > **Libraries**.
3. Add the JAR file to your project's build path.

---

## Usage Example

```java
import com.ibm.stringutils.StringProcessor;
import com.ibm.stringutils.StringProcessorImpl;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessorImpl();
        
        // Example: Capitalize Words
        String result = processor.capitalizeWords("hello world from ibm style");
        System.out.println(result); // Output: Hello World From Ibm Style
        
        // Example: Palindrome Check
        boolean isPalindrome = processor.isPalindrome("Racecar");
        System.out.println("Is Palindrome: " + isPalindrome); // Output: true
        
        // Example: Truncate
        System.out.println(processor.truncate("Software Engineering", 8)); // Output: Software...
    }
}