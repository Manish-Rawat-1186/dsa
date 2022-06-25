package array;

import java.util.Arrays;

//https://leetcode.com/problems/transpose-matrix/
public class Array14 {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6}};
        int colum = matrix.length;
        int row = matrix[0].length;
        int[][] trans = new int[row][colum];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.deepToString(trans));
    }


}
