package array;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/add-to-array-form-of-integer/
public class Array15 {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        ArrayList <Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum*10 + arr[i];
//        }
//        System.out.println(sum);
//        sum = sum +k;
//        System.out.println(sum);
//        while (sum>0){
//            list.add(sum%10);
//            sum /= 10;
//        }
        //second solution
        for (int i = arr.length -1; i >= 0  ; --i) {
             list.add(0, (arr[i]+k)%10 );
             k = (arr[i]+k)/10;
        }

        while (k>0){
            list.add(k%10);
            k /= 10;
        }
        Collections.reverse(list);

        System.out.println(list);


    }
}
