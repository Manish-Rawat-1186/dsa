package array;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = new int[nums.length];
        int i = 0;
        while (i < nums.length){
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    count++;
            }
            ans[i] = count;
            i++;
        }

        System.out.println(Arrays.toString(ans));
    }
    }

