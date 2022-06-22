package array;

public class power {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    static boolean isPowerOfTwo(int n){
        if(n==1)
            return true;
        if(n==0){
            return  false;
        }
        if (n%2 != 0){
            return false;
        }
        else
           return isPowerOfTwo(n/2);
    }
}
