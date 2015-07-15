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
package it.terrinoni.projecteuler.six;

/**
 * Sum square difference; problem 6.
 *
 * @author Marco Terrinoni
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        int limit = 100;
        long sumOfSquares = 0, squareOfSums = 0;

        for(int i = 1; i <= limit; i++) {
            sumOfSquares += Math.pow(i, 2);
            squareOfSums += i;
        }
        
        squareOfSums = (long) Math.pow(squareOfSums, 2);
        
        long diff = squareOfSums - sumOfSquares;
        
        System.out.println("The difference between the sum of the squares and the square of the sum is: " + String.valueOf(diff));
    }
}
