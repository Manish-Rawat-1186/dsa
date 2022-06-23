package array;
//https://leetcode.com/problems/number-of-good-pairs/
public class Array7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        int i = 0;
        int count = 0;
        while (i < arr.length){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            i++;
        }

        System.out.println(count);
    }
}
