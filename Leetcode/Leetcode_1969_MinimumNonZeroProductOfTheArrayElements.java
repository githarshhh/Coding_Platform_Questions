public class Leetcode_1969_MinimumNonZeroProductOfTheArrayElements {
    public static int mod = 1000000007;
    public int minNonZeroProduct(int p) {
        long max = 1L << p;
        long halfcount = max/2 - 1;

        return (int) (power(max-2,halfcount) * ((max - 1) % mod) % mod);
    }

    public long power(long base, long expo){
        if(expo == 0){
            return 1L;
        }
        base = base % mod;
        if(expo % 2 == 1){
            return base * power(base, expo -1) % mod;
        }else{
            return power(base * base, expo/2) % mod;
        }
    }
}
