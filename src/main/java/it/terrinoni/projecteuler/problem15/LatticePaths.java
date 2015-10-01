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
package it.terrinoni.projecteuler.problem15;

/**
 * Lattice paths; problem 15.
 *
 * @author Marco Terrinoni
 */
public class LatticePaths {

    public static void main(String[] args) {
        int gridSize = 20;
        long[][] grid = new long[gridSize + 1][gridSize + 1];

        // Grid initialization (boundary to 1)
        for (int i = 0; i < gridSize; i++) {
            grid[i][gridSize] = 1;
            grid[gridSize][i] = 1;
        }

        // Find paths
        for (int i = gridSize - 1; i >= 0; i--) {
            for (int j = gridSize - 1; j >= 0; j--) {
                grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
            }
        }

        System.out.println("In a 20x20 grid there are " + String.valueOf(grid[0][0])
                + " possible routes.");
    }
}
