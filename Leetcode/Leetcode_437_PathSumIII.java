import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class Leetcode_437_PathSumIII {
    int total = 0;
    HashMap<Long, Integer> mp;

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        mp = new HashMap<>();
        mp.put(0L,1);

        findPathSum(root, targetSum, 0L, mp);

        return total;
    }

    private void findPathSum(TreeNode root, int targetSum, long currSum, HashMap<Long, Integer> mp){
        if(root == null) return;

        currSum += root.val;
        if(mp.containsKey(currSum - targetSum)){
            total += mp.get(currSum - targetSum);
        }
        mp.put(currSum, mp.getOrDefault(currSum, 0) + 1);

        findPathSum(root.left, targetSum, currSum, mp);
        findPathSum(root.right, targetSum, currSum, mp);
        mp.put(currSum, mp.get(currSum) - 1);

        return;
    }
}
