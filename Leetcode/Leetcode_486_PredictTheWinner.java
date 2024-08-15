import java.util.Arrays;

public class Leetcode_486_PredictTheWinner {
    static int[][] memo;
    public int solve(int i, int j, int[] nums){
        if(i>j) return 0;
        if(i == j) return nums[i];
        if(memo[i][j] != -1){
            return memo[i][j];
        }

        int take_i = nums[i] + Math.min(solve(i+2, j, nums), solve(i+1, j-1, nums)); 
        int take_j = nums[j] + Math.min(solve(i, j-2, nums), solve(i+1, j-1, nums));

        return memo[i][j] = Math.max(take_i, take_j);
    }
    
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        int sum = 0;

        memo = new int[n+1][n+1];
        for(int[] m: memo){
            Arrays.fill(m,-1);
        }

        for(int m=0; m<n; m++){
            sum += nums[m];
        }
        
        int p1Score = solve(0, n-1, nums);
        int p2Score = sum - p1Score;
        return p1Score >= p2Score;
    }
}
