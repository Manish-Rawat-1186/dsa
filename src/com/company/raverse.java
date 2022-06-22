package com.company;

public class raverse {
    static int sum = 0;
    static void rev(int n){
        if (n==0)
            return;
        int rem = n %10;
        sum = sum * 10 + rem;
        rev(n/10);
    }

    //we can do this by another method

    static int rev1(int n){
        int digit = (int)(Math.log10(n)+1);
        return helper(n, digit); 
    }

    private static int helper(int n, int digit){
        if(n%10==n)
            return n;
        int rem = n%10;
        return rem*(int)(Math.pow(10,digit-1)) + helper(n/10, digit-1);
    }

    public static void main(String[] args) {
        int n = 633;
        int reverse = rev1(n);
        if(n == reverse){
            System.out.println("no. is parildrom ");
        }else {
            System.out.println(reverse);
        }
    }

}
