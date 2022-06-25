package array;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Array13 {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i]/10;
                num++;
            }
            if (num % 2 == 0)
                count++;

        }
        System.out.println(count);
    }
}
