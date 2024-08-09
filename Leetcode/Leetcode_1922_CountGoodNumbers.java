public class Leetcode_1922_CountGoodNumbers {
    public long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = n/2 + n%2;

        return (int)(power(5,even) * power(4,odd) % mod);
    }

    public long power(long x, long y){
        if(y==0) return 1;

        long temp = power(x,y/2);

        if(y%2 == 0) return (temp * temp)%mod;
        else return ((temp * temp)*x)%mod;
    }
}
