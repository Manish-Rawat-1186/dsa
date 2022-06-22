package array;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class Array5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] ans = new int[2*n];
        for (int i = 0; i < ans.length; i++) {
            if (i%2 == 0)
                ans[i] = nums[i/2];
            if(i%2 != 0)
                ans[i] = nums[i/2 + n];
        }
        System.out.println(Arrays.toString(ans));
    }
}
