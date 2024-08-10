public class Leetcode_50_pow(x,n) {
    public double myPow(double x, int n){
        return powerCalculator(x, (long) n);
    }

    public double powerCalculator(double x, long n){
        if(n == 0) {
            return 1;
        }
        if(n < 0){
            return 1/powerCalculator(x,-n);
        }
        if(n%2 == 0){
            return powerCalculator(x*x, n/2);
        }else{
            return x*powerCalculator(x*x, (n-1)/2);
        }
    }
}
