import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode_2476_ClosestNodesQueriesInABinarySearchTree {
    ArrayList<Integer> elements = new ArrayList<>();

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> ans = new ArrayList<>();

        inorder(root);
        
        for(int i=0; i<queries.size(); i++){
            List<Integer> ll = new ArrayList<>();
            ll.add(checkLowerBound(queries.get(i)));
            ll.add(checkUpperBound(queries.get(i)));
            
            ans.add(ll);
        }

        return ans;
    }

    private void inorder(TreeNode node){
        if(node == null) return;

        inorder(node.left);
        elements.add(node.val);
        inorder(node.right);
    }

    private int checkLowerBound(int value){
        int answer = -1;
        int low = 0, high = elements.size()-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(elements.get(mid) <= value){
                answer = elements.get(mid);
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return answer;
    }

    private int checkUpperBound(int value){
        int answer = -1;
        int low = 0, high = elements.size()-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(elements.get(mid) >= value){
                answer = elements.get(mid);
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return answer;
    }
}
