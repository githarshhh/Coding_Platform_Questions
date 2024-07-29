public class Leetcode_231_PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false; // added a check for n <= 0

        int x = 0;

        return ispower(x, n);
    }

    public static boolean ispower(int x,int n){
        double val = Math.pow(2,x);
        if(val > n) return false;

        if(val == n) return true;
        else if(x > 30) return false; // added a check to prevent stack overflow
        else return ispower(x+1, n);
        
    }
}
