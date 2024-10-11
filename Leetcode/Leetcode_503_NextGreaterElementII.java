import java.util.Stack;

public class Leetcode_503_NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stk = new Stack<>();

        for(int i=2*n-1; i>=0; i--){
            while(!stk.isEmpty() && nums[i%n] >= stk.peek()){
                stk.pop();
            }
            if(i<n){
                ans[i] = stk.isEmpty()? -1 : stk.peek();
            }
            stk.push(nums[i%n]);
        }
        return ans;
    }
}
