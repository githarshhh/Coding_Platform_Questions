import java.util.Arrays;

public class Leetcode_279_PerfectSquares {
    int[] arr = new int[10001];
    public int helper(int n){
        int mincount = Integer.MAX_VALUE;

        if(n == 0) return 0;

        if(arr[n] != -1) return arr[n];

        for(int i=1; i*i<=n; i++){
            int result = 1 + helper(n - i*i);

            mincount = Math.min(mincount,result);
        }

        return arr[n] = mincount;
    }


    public int numSquares(int n) {
        Arrays.fill(arr,-1);
        return helper(n);    
    }
}
