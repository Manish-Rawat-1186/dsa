package array;

import java.util.Arrays;

//https://leetcode.com/problems/non-decreasing-array/
public class Array19S {
    public static void main(String[] args) {
        int[] nums = {4,2,1,5};
        int count = 0;
        for (int i = 1; i < nums.length ; i++) {

            if (nums[i-1] > nums[i]) {
                count++;
            }

        }
        if (count > 1){
            System.out.println(false);
            System.out.println(count);
        }else{
            System.out.println(true);
            System.out.println(count);
        }
    }
}
