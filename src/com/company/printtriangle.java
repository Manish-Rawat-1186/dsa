package com.company;

import java.util.Arrays;

public class printtriangle {

    static void printTriangle(int[] arr){
        //base condition
        if (arr.length < 1)
            return;

        //algorithm
        int[] temp = new int[arr.length-1];
        for (int i = 0; i < arr.length - 1; i++) {
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }
        System.out.println(Arrays.toString(temp));
        printTriangle(temp);
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        printTriangle(arr);
    }

}
