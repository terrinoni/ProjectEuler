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
package it.terrinoni.projecteuler.problem14;

/**
 * Longest Collatz sequence; problem 14.
 *
 * @author Marco Terrinoni
 */
public class LongestCollatzSequence {

    public static void main(String[] args) {
        int limit = 1000000;
        int maxReached = 0;
        long bestStarting = 0;

        for (int i = 1; i <= limit; i++) {
            int step = 0;
            long num = i;
            while (num > 1) {
                if (num % 2 == 0) {
                    num = isEven(num);
                } else {
                    num = isOdd(num);
                }
                step++;
            }
            if (step > maxReached) {
                maxReached = step;
                bestStarting = i;
            }
        }

        System.out.println("The longest chain (" + String.valueOf(maxReached + 1)
                + " values) starts with number " + String.valueOf(bestStarting));
    }

    private static long isEven(long num) {
        return num / 2;
    }

    private static long isOdd(long num) {
        return 3 * num + 1;
    }
}
