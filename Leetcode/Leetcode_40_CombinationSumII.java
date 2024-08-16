import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_40_CombinationSumII {
    public void solve(int[] candidates, int target, int idx, List<Integer> curr, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList(curr));
            return;
        }
        if(target < 0) return;

        for(int i=idx; i<candidates.length; i++){
            if(i>idx && candidates[i] == candidates[i-1]){
                continue;
            }
        
            curr.add(curr.size(),candidates[i]);
            solve(candidates, target-candidates[i], i+1, curr, res);
            curr.remove(curr.size()-1);        
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<>();

        Arrays.sort(candidates);
        solve(candidates, target, 0, curr, res);
        return res;
    }
}
