import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Leetcode_662_MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        Queue<Pair<TreeNode, Long>> queue = new LinkedList<>();
        queue.offer(new Pair(root, 0L));
        long maxWidth = 0;

        while(!queue.isEmpty()){
            int n = queue.size();
            long first = queue.peek().getValue();
            long last = first;

            for(int i=0; i<n; i++){
                Pair<TreeNode, Long> current = queue.poll();
                TreeNode node = current.getKey();
                long idx = current.getValue();

                if(i == n-1){
                    last = idx;
                }

                if(node.left != null){
                    queue.offer(new Pair<>(node.left, 2*idx+1));
                }

                if(node.right != null){
                    queue.offer(new Pair<>(node.right, (2*idx)+2));
                }

                maxWidth = Math.max(maxWidth, last-first+1);
            }

        }
        return (int)maxWidth;
    }
}
