package array;

import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix-ii/
public class Array18M {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];
        int row = 0;
        int rowEnd = matrix.length-1;
        int col = 0;
        int count = 1;
        int colEnd = matrix[0].length-1;
        while (rowEnd >= row && colEnd >= col){

            for (int i = col; i <= colEnd; i++) {
                matrix[row][i] = count;
                count++;
            }
            row++;
            for (int i = row; i <= rowEnd ; i++) {
                matrix[i][colEnd] = count;
                count++;
            }
            colEnd--;

            if ( row <= rowEnd){

                for (int i = colEnd; i >= col ; i--) {
                    matrix[rowEnd][i]=count;
                    count++;
                }
            }

            rowEnd--;

            if (col <= colEnd){
                for (int i = rowEnd; i >= row; i--) {
                    matrix[i][col] = count;
                    count++;
                }
            }

            col++;

        }
        System.out.println(Arrays.deepToString(matrix));

    }
}
