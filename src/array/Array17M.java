package array;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/spiral-matrix/
public class Array17M {
    public static void main(String[] args) {
        int[][] matrix  = {{1,2,3}, {4,5,6},{7,8,9} };
        ArrayList <Integer> list = new ArrayList<>();
        int row = 0;
        int rowEnd = matrix.length-1;
        int col = 0;
        int colEnd = matrix[0].length-1;
        while (rowEnd >= row && colEnd >= col){
            for (int i = col; i <= colEnd; i++) {
                list.add(matrix[row][i]);
            }
            row++;
            for (int i = row; i <= rowEnd ; i++) {
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            if ( row <= rowEnd){

                for (int i = colEnd; i >= col ; i--) {
                    list.add(matrix[rowEnd][i]);
                }
            }

            rowEnd--;

            if (col <= colEnd){
                for (int i = rowEnd; i >= row; i--) {
                    list.add(matrix[i][col]);
                }
            }

            col++;

        }


        System.out.println(list);

    }
}
