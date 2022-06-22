package com.company;

import java.util.ArrayList;

public class linear {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 12, 6, 8, 23, 12};
        System.out.println(lin(arr, 0, 12));
        System.out.println(linindex(arr, 0, 12));
        linallindex(arr, 0, 12);
        System.out.println(list);
    }
    static boolean lin(int[] arr, int index, int target){
        //base condition
        if (index==arr.length){
            return false;
        }
        return arr[index]==target || lin(arr,index+1, target);
    }
    static int linindex(int[] arr, int index, int target){
        //base condition
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return linindex(arr, index+1, target);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void linallindex(int[] arr, int index, int target){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target)
            list.add(index);
        linallindex(arr, index+1, target);
    }


}
