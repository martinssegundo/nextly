package com.nextly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void checkPalindromeWithPalindrome(){
        final String word = "HANNAH";
        assertTrue(PalindromeChecker.isPalindrome(word));
    }

    @Test
    void checkPalindromeWithoutPalindrome(){
        final String word = "GAGA";
        assertFalse(PalindromeChecker.isPalindrome(word));
    }
}