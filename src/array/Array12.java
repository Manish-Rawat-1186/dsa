package array;
//https://leetcode.com/problems/matrix-diagonal-sum/
public class Array12 {
    public static void main(String[] args) {

        int[][] mat = {{1,1,1,1}, {1,1,1,1}, {1,1,1,1},{1,1,1,1}};
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n-1-i];
        }
        if (n % 2 != 0)
            sum -= mat[n/2][n/2];
        System.out.println(sum);
    }

}

