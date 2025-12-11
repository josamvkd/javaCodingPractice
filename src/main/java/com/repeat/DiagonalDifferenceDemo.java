package com.repeat;

// Given a square matrix, calculate the absolute difference between the sums of its diagonals.
// For example, the square matrix  is shown below:
// 1 2 3
// 4 5 6
// 9 8 9
public class DiagonalDifferenceDemo
{
    static void main()
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {9, 8, 9}
        };

        int result = diagonalDifference(matrix);
        System.out.println("Diagonal difference is : " + result);
    }

    public static int diagonalDifference(int[][] matrix)
    {
        int n = matrix.length;
        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;
        for (int i = 0; i < n; i++) {
            leftToRightDiagonal += matrix[i][i]; // [0][0] = 1, [1][1] = 5, [2][2] = 9 = 15;
            rightToLeftDiagonal += matrix[i][n-1-i]; // [0][3-1-0] = [0][2]= 3, [1][3-1-1] = [1][1] = 5, [2][3-1-2] =[2][0] = 9 = 19
        }
        return Math.abs(leftToRightDiagonal-rightToLeftDiagonal);
    }


}
