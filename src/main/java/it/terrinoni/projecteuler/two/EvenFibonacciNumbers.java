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
package it.terrinoni.projecteuler.two;

/**
 * Even Fibonacci numbers; problem 2.
 *
 * @author Marco Terrinoni
 */
public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        int limit = 4000000,
                val1 = 1,
                val2 = 2,
                val3,
                sum = 0;

        while ((val1 < limit) || (val2 < limit)) {
            if (val1 % 2 == 0) {
                sum += val1;
            }
            val3 = val1 + val2;
            val1 = val2;
            val2 = val3;
        }

        System.out.println("The sum of the even-valued terms is: " + String.valueOf(sum));
    }
}
