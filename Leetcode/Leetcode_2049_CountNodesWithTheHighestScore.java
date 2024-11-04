import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode_2049_CountNodesWithTheHighestScore {
    HashMap<Long, List<Long>> map = new HashMap<>();
    int totalNodes = 0;
    long maxscore = 0;

    public int countHighestScoreNodes(int[] parents) {
        TreeNode root = createTree(parents);
        totalNodes = parents.length;
        calculateScores(root);
        return map.get(maxscore).size();
    }

    public int calculateScores(TreeNode node){
        if(node == null) return 0;

        int leftSize = calculateScores(node.left);
        int rightSize = calculateScores(node.right);

        long score = 1;
        if(leftSize != 0) score *= leftSize;
        if(rightSize != 0) score *= rightSize;
        if(totalNodes - leftSize - rightSize - 1 != 0){
            score *= (totalNodes - leftSize - rightSize - 1);
        }

        maxscore = Math.max(score, maxscore);

        map.putIfAbsent(score, new ArrayList<>());
        map.get(score).add((long)node.val);

        return leftSize + rightSize + 1;
    }

    public TreeNode createTree(int[] parents){
        int n = parents.length;
        TreeNode[] nodes = new TreeNode[n];

        for(int i = 0; i < n; i++){
            nodes[i] = new TreeNode(i);
        }

        TreeNode root = null;
        for(int i = 0; i < n; i++){
            if(parents[i] == -1) root = nodes[i];
            else{
                TreeNode parent = nodes[parents[i]];
                if(parent.left == null){
                    parent.left = nodes[i];
                }else{
                    parent.right = nodes[i];
                }
            }
        }

        return root;
    }
}
