import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreeNode;

public class Leetcode_501_FindModeInBinarySearchTree {
    private Map<Integer,Integer> mp = new HashMap<>();
    public int[] findMode(TreeNode root) {
        dfs(root);

        ArrayList<Integer> arr = new ArrayList<>();

        int maxFreq = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            int value = entry.getKey();
            int freq = entry.getValue();

            if(freq > maxFreq){
                maxFreq = freq;
                arr.clear();
                arr.add(value);
            }else if(freq == maxFreq){
                arr.add(value);
            }
        }

        int[] res = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i] = arr.get(i);
        }

        return res;
    }

    private void dfs(TreeNode root){
        if(root == null) return;

        dfs(root.left);
        mp.put(root.val, mp.getOrDefault(root.val,0)+1);
        dfs(root.right);
    }
}
