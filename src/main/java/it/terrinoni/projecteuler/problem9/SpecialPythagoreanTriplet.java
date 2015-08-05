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
package it.terrinoni.projecteuler.problem9;

/**
 * Special Pythagorean triplet; problem 9.
 *
 * @author Marco Terrinoni
 */
public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        int sum = 1000;
        for (int a = 1; a < (sum / 3); a++) {
            for (int b = (a + 1); b < (sum / 2); b++) {
                int c = (sum - a - b);
                if (isPythagoreanTriplet(a, b, c)) {
                    System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
                    System.out.println("The product of abc is " + String.valueOf(a * b * c));
                }
            }
        }
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        return (Math.pow(a, 2) + Math.pow(b, 2)) == (Math.pow(c, 2));
    }
}
