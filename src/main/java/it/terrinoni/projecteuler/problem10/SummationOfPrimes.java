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
package it.terrinoni.projecteuler.problem10;

/**
 * Summation of primes; problem 10.
 *
 * @author Marco Terrinoni
 */
public class SummationOfPrimes {

    public static void main(String[] args) {
        long sum = 0;
        int max = 2000000;
        for (int i = 2; i < max; i++) {
            if (isPrime((long) i)) {
                sum += (long) i;
            }
        }
        System.out.println("The sum of all the primes below two million is: "
                + String.valueOf(sum));
    }

    /**
     * Iterate from 2 to square root of the number in exam.
     *
     * @param val the number in exam.
     * @return true if the number in exam is prime, false otherwise.
     */
    static boolean isPrime(long val) {
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if ((val % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
