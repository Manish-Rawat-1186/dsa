package array;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class Array6 {
    public static void main(String[] args) {
        ArrayList <Boolean> list = new ArrayList<>();
        int[] candies = {2,3,5,1,3};
        int n = 3;
        for (int candy : candies) {
            int max = MIN_VALUE;
            int sum = candy + n;
            if (sum >= max) {
                max = sum;
                list.add(true);
            }else {
                list.add(false);
            }

        }
        System.out.println(list);


    }
}

