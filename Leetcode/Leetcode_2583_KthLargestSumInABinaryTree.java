import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Leetcode_2583_KthLargestSumInABinaryTree {
    ArrayList<Long> sumLevel = new ArrayList<>();
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) return -1;
        
        calculateSum(root);
        int n = sumLevel.size();
        Collections.sort(sumLevel);

        if(k > n) return -1;
        else return sumLevel.get(n-k);
    }

    private void calculateSum(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            long sum = 0;
            for(int i=0; i<levelNum; i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            sumLevel.add(sum);
        }
    }
}
