package com.company;

public class power {
    public static void main(String[] args) {

        int ans = pow(2,4);
        System.out.println(ans);

    }

    static int pow(int a, int b){
        if (b==0)
            return 1;
        return pow(a,b-1)*a;
    }
}
