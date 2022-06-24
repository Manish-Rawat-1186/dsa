package array;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class Array11 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[i].length)/2; j++) {
                int temp = image[i][j];
                image[i][j]=image[i][image[i].length-1 -j ];
                image[i][image[i].length-1-j] = temp;
            }
        }
        System.out.println(Arrays.deepToString(image));

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0){
                    image[i][j]=1;
                }else {
                    image[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(image));
    }
}
