package com.interview.enbd;
// Given a square matrix, calculate the absolute difference between the sums of its diagonals.
// For example, the square matrix  is shown below:
// 1 2 3
// 4 5 6
// 9 8 9
// The left-to-right diagonal =15 . The right to left diagonal = 17. Their absolute difference is 2.
public class DiagonalDifference {

    public static void main(String[] args) {
        // Example square matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

        int result = diagonalDifference(matrix);
        System.out.println("Absolute diagonal difference: " + result);
    }

    public static int diagonalDifference(int[][] matrix) {
        int n = matrix.length;
        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;

        for (int i = 0; i < n; i++) {
            leftToRightDiagonal += matrix[i][i]; // [0][0] = 1, [1][1] = 5, [2][2] = 9 Total = 15
            rightToLeftDiagonal += matrix[i][n-1-i]; // [0][2](ie,[3-1-0]) = 3, [1][1](ie,[3-1-1]) = 5, [2][0](ie,[3-1-2]) = 9 Total =17
        }

        return Math.abs(leftToRightDiagonal - rightToLeftDiagonal);
    }
}

