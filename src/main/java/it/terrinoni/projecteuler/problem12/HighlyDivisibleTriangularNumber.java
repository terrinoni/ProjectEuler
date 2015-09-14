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
package it.terrinoni.projecteuler.problem12;

/**
 * Highly divisible triangular number; problem 12.
 *
 * @author Marco Terrinoni
 */
public class HighlyDivisibleTriangularNumber {

    public static void main(String[] args) {
        int triangNumber = 0;
        int count = 1;

        while (numberOfDivisors(triangNumber) < 500) {
            triangNumber += count; // generate new triangle number
            count++; // increment the counter
        }

        System.out.println(
                "The value of the first triangle number to have over five hundred divisors is: "
                + String.valueOf(triangNumber));
    }

    private static int numberOfDivisors(int number) {
        int numOfDivisors = 0;
        int sqrt = (int) Math.sqrt((double) number);

        // Compute the number of divisors
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) { // i divides number
                numOfDivisors += 2;
            }
        }

        // Correction if the number is a perfect square
        if (sqrt * sqrt == number) {
            numOfDivisors--;
        }

        return numOfDivisors;
    }
}
