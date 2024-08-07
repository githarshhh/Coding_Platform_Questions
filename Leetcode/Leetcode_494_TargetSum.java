public class Leetcode_494_TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        return totalways(nums,target,0,0);
    }

    public int totalways(int[] nums, int target, int idx, int currSum){
        if(idx >= nums.length){
            if(currSum == target){
                return 1;
            }else return 0;
        }

        int positive = totalways(nums,target,idx+1,currSum + nums[idx]);
        int negative = totalways(nums,target,idx+1,currSum - nums[idx]);

        return positive + negative;
    }

}