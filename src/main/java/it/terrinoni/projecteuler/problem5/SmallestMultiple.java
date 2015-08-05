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
package it.terrinoni.projecteuler.problem5;

/**
 * Smallest multiple; problem 5.
 *
 * @author Marco Terrinoni
 */
public class SmallestMultiple {

    public static void main(String[] args) {
        int num = 1;

        while (num < Integer.MAX_VALUE) {
            if (isEvenlyDivisible(num)) {
                break;
            }
            num++;
        }

        System.out.println("The smallest positive number evenly divisible by all numbers from 1 to "
                + "20 is: " + String.valueOf(num));
    }

    /**
     * Check if the number in exam is evenly divisible by all the numbers from 1 to 20.
     *
     * This method works in a brute-force mode, checking all the possible divisors from 1 to 20; a
     * possible variant could consist in the removal of several divisors (like 2, 3, 4, 5, etc.).
     *
     * @param num the number in exam.
     * @return true if the number is exam is evenly divisible by all the numbers from 1 to 20.
     */
    private static boolean isEvenlyDivisible(int num) {
        int minLimit = 1;
        int maxLimit = 20;
        boolean flag = true;

        // Check all the possible divisions (brute-force)
        for (int i = minLimit; i <= maxLimit && flag; i++) {
            if ((num % i) != 0) {
                flag = false;
            }
        }

        return flag;
    }
}
