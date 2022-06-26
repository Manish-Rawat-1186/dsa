package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array20M {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        System.out.println(list);
        int count = 0;
       while (list.size() > count){
           for (int i = 0; i < matrix.length; i++) {
               matrix[i][list.get(count)] = 0;
           }
           for (int i = 0; i <= matrix[0].length; i++) {
               matrix[list.get(count)][i] = 0;
           }
           count++;
       }

        System.out.println(Arrays.deepToString(matrix)  );


    }
}
