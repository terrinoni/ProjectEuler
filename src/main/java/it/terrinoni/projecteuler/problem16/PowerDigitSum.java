/*
 * The MIT License
 *
 * Copyright 2015 Marco Terrinoni <marco.terrinoni at consoft.it>.
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
package it.terrinoni.projecteuler.problem16;

import java.math.BigInteger;

/**
 * Power digit sum; problem 16.
 *
 * Generate 2^1000 and store it into a String, then iterate char by char over this String, where
 * each char represents a digit. The sum is computed by adding every digit (from a substring) of the
 * original String.
 *
 * @author Marco Terrinoni
 */
public class PowerDigitSum {

    public static void main(String[] args) {
        String powNum = new BigInteger("2").pow(1000).toString();
        BigInteger result = BigInteger.ZERO;

        // Iterate char by char
        for (int i = 0; i < powNum.length(); i++) {
            String currVal = powNum.substring(i, i + 1); // extract the current value
            BigInteger currBigInt = new BigInteger(currVal); // convert the current value to a BigInteger (a long could be enough)
            result = result.add(currBigInt); // make the sum
        }

        System.out.println("The sum of the digits of the number 2^1000 is: " + result.toString());
    }
}
