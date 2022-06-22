package com.company;

public class pratice {
    public static void main(String[] args) {
        inc(5);
    }
    static int dic(int n){
        if (n<1)
            return 1;
        System.out.println(n);
        return dic(n-1);
    }

    static void inc(int n){
        if (n<1)
            return ;
        inc(n-1);
        System.out.println(n);
    }




}
