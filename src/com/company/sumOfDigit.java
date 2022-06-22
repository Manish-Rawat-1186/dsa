package com.company;

public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println(sod(1342));
        System.out.println(pod(1342));
    }
    static int sod(int n){
        if (n < 10){
            return n;
        }
        return n%10 + sod(n/10);
    }
    static int pod(int n){
        if (n < 10){
            return n;
        }
        return n%10 * pod(n/10);
    }
}
