package com.company;

public class gfg {
    //Recursive Programs to find Minimum and Maximum elements of array

    static int minrec(int[] arr){
        //base condition
        int n= arr.length;
        return helper(arr, n);
    }

    private static int helper(int[] arr, int n){
        if (n==1)
            return arr[0];
        return Math.min(arr[n-1], helper(arr, n-1));
    }

    static int maxrec(int[] arr){
        //base condition
        int n= arr.length;
        return helper2(arr, n);
    }

    private static int helper2(int[] arr, int n){
        if (n==1)
            return arr[0];
        return Math.max(arr[n-1], helper2(arr, n-1));
    }

    public static void main(String[] args) {
        int[] arr={1, 4, 45, 6, -50, 10, 2};
        System.out.println(minrec(arr));
        System.out.println(maxrec(arr));
    }
}
