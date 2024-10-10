import java.util.Stack;

public class Leetcode_1673_FindTheMostCompetitiveSubsequence {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stk = new Stack<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(stk.size() > k){
                break;
            }

            while(!stk.isEmpty() && nums[i] < nums[stk.peek()] && stk.size() + (n-i) > k){
                stk.pop();
            }

            if(stk.size() < k){
                stk.push(i);
            }
        }

        int result[] = new int[k];
        for(int i=k-1; i>=0; i--){
            result[i] = nums[stk.pop()];
        }

        return result;
    }
}
