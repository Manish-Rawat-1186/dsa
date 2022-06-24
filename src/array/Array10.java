package array;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-highest-altitude/
public class Array10 {
    public static void main(String[] args) {
        int[] alt = {-4,-3,-2,-1,4,3,2};

        int[] newAlt = new int[alt.length +1];

        for (int i = 0; i < alt.length ; i++) {
            newAlt[i+1] = newAlt[i] + alt[i];

        }
        System.out.println(Arrays.toString(newAlt));

        int max= Integer.MIN_VALUE;
        for (int i = 0; i < alt.length; i++) {
            if (newAlt[i] >= max)
                max = newAlt[i];
        }
        System.out.println(max);

    }

}
