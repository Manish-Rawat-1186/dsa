package array;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/
public class Array1 {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};

        //create an array list
        ArrayList <Integer> Ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            Ans.add(nums[nums[i]]);
        }
        Integer[] ans = Ans.toArray(new Integer[Ans.size()]);

        System.out.println(Arrays.toString(ans));
    }
}
