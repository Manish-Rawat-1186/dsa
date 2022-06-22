package com.company;

public class Binary {
    public static void main(String[] args) {
        int[] arr= { 1, 3, 5, 7, 23, 45, 67, 89, 90};
        int start = 0;
        int end = arr.length -1;
        int target = 89;
        System.out.println(binarySearch(arr, target, start, end));
    }

    static int binarySearch(int[] arr, int target, int start, int end){

        if (start>end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if (arr[mid] == target){
            //if we don't return any return value
            return mid;
        }

        if (arr[mid] < target){
            //then we wouldn't any value.
            return binarySearch(arr, target, mid+1, end);
        }else {
           return binarySearch(arr, target, start, mid-1);
        }

    }
}
