package array;

import java.util.ArrayList;
import java.util.Arrays;
//https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/
public class Array9 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        //initialize arrylist
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        System.out.println(Arrays.toString(target));

    }

}
