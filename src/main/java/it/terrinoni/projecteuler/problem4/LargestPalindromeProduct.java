/*
 * The MIT License
 *
 * Copyright 2015 Marco Terrinoni.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package it.terrinoni.projecteuler.problem4;

/**
 * Largest palindrome product; problem 4.
 *
 * @author Marco Terrinoni
 */
public class LargestPalindromeProduct {

    public static void main(String[] args) {
        long maxPalindrome = 0;
        long fact1 = 0, fact2 = 0;

        for (int i = 1000; i > 99; i--) {
            for (int j = 1000; j > 99; j--) {
                long val = i * j;
                if (isPalindrome(val) && (maxPalindrome < val)) {
                    maxPalindrome = val;
                    fact1 = i;
                    fact2 = j;
                }
            }
        }

        System.out.println("The largest palindrome is: " + String.valueOf(maxPalindrome) + " = "
                + String.valueOf(fact1) + " * " + String.valueOf(fact2));
    }

    /**
     * Check if the number in exam is palindrome.
     *
     * @param num the number to be checked.
     * @return true if the number in exam is palindrome, false otherwise.
     */
    private static boolean isPalindrome(long num) {
        long palindrome = num;
        long reverse = 0;

        // Build the reverse
        while (palindrome != 0) {
            long rest = palindrome % 10;
            reverse = (reverse * 10) + rest;
            palindrome /= 10;
        }

        return (reverse == num);
    }
}
