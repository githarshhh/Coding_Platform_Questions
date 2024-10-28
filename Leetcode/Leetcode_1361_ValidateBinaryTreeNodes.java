import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Leetcode_1361_ValidateBinaryTreeNodes {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Map<Integer, List<Integer>> parentToChild = new HashMap<>();
        Map<Integer, Integer> childToParent = new HashMap<>();

        for(int i=0; i<n; i++){
            int node = i;
            int leftChildNode = leftChild[i];
            int rightChildNode = rightChild[i];

            if(leftChildNode != -1){
                parentToChild.computeIfAbsent(node, k-> new ArrayList<>()).add(leftChildNode);

                if(childToParent.containsKey(leftChildNode)){
                    return false;
                }else {
                    childToParent.put(leftChildNode, node);
                }
            }

            if(rightChildNode != -1){
                parentToChild.computeIfAbsent(node, k-> new ArrayList<>()).add(rightChildNode);

                if(childToParent.containsKey(rightChildNode)){
                    return false;
                }else {
                    childToParent.put(rightChildNode, node);
                }
            }
        }

        int root = -1;

        for(int i=0; i<n; i++){
            if(!childToParent.containsKey(i)){
                if(root != -1){
                    return false;
                } else{
                    root = i;
                }
            }
        }

        if(root == -1) return false;

        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        queue.add(root);
        visited[root] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();

            for(int child: parentToChild.getOrDefault(node, Collections.emptyList())){
                if(!visited[child]){
                    visited[child] = true;
                    count++;
                    queue.add(child);
                }
            }
        }
        return count == n;
    }
}
