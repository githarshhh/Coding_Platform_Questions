import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import javax.swing.tree.TreeNode;

public class Leetcode_863_AllNodesDistanceKInBinaryTree {
    private  Map<TreeNode, TreeNode> parent = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result = new ArrayList<>();

        addParent(root);
        collectDistinct(target, k, result);

        return result;
    }

    private void addParent(TreeNode root){
        if(root == null) return;

        if(root.left != null) parent.put(root.left,root);
        addParent(root.left);

        if(root.right != null) parent.put(root.right, root);
        addParent(root.right);
    }

    private void collectDistinct(TreeNode target, int k, List<Integer> result){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(target);
        Set<Integer> visited = new HashSet<>();
        visited.add(target.val);

        while(!queue.isEmpty()){
            int n = queue.size();
            if(k==0) break;

            for(int i=0; i<n; i++){
                TreeNode curr = queue.poll();

                if(curr.left != null && !visited.contains(curr.left.val)){
                    queue.add(curr.left);
                    visited.add(curr.left.val);
                }

                if(curr.right != null && !visited.contains(curr.right.val)){
                    queue.add(curr.right);
                    visited.add(curr.right.val);
                }

                if(parent.containsKey(curr) && !visited.contains(parent.get(curr).val)){
                    queue.add(parent.get(curr));
                    visited.add((parent.get(curr).val));
                }
            }
            k--;
        }

        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            result.add(temp.val);
        }
    }
}
