package array;

import java.util.Arrays;

//https://leetcode.com/problems/concatenation-of-array/
public class Array2 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int n = nums.length;
        int[] ans  = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            if(i >= n) {
                ans[i] = nums[i-n];
            }else {
                ans[i] = nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }


}
