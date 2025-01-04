public class Leetcode_1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int count[] = new int [nums.length];
    
            for(int i=0; i<nums.length; i++){
                int c=0;
                for(int j=0; j<nums.length; j++){
                    if(i==j){
                        continue;
                    }
                    if(nums[j] < nums[i]){
                        c++;
                    }
                    count[i] = c;
                }
            }
            
           return count;
        }
    }
}
