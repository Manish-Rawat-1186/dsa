package array;
//https://leetcode.com/problems/richest-customer-wealth/
public class Array4 {
    public static void main(String[] args) {
        int[][] arr = { {1, 1, 1, 1},

                {2, 2, 2, 2},

                {3, 3, 3, 3} };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum +=  arr[i][j];
            }
            if (sum > max){
                max = sum;
            }

        }
        System.out.println(max);
    }
}
