package array;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.*;

public class Array6 {
    public static void main(String[] args) {
        ArrayList <Boolean> list = new ArrayList<>();
        Integer[] candies = {2,3,5,1,3};
        int n = 3;
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            max = Integer.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + n;
            if (sum >= max) {
                int temp = sum;
                max = sum;
                list.add(true);
            } else {
                list.add(false);
            }

        }
        System.out.println(list);


    }
}

