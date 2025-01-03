public class Leetcode_2270_NumberOfWaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int ans = 0;

        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];

        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }

        for(int i=0; i<n; i++){
            if(prefixSum[i] >= (prefixSum[n-1] - (prefixSum[i])) && i<n-1){
                ans++;
            }
        }

        return ans;
}
