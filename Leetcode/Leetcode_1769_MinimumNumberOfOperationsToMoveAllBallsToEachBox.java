import java.util.ArrayList;

public class Leetcode_1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] arr = new int[n];
        ArrayList<Integer> contains = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(boxes.charAt(i) == '1'){
                contains.add(i);
            }
        }

        for(int i=0; i<n; i++){
            int val = 0;
            for(int j=0; j<contains.size(); j++){
                val += Math.abs(contains.get(j) - i);
            }
            arr[i] = val;
        }

        return arr;
    }
}
