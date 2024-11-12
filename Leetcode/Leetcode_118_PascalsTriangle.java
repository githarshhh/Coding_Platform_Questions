import java.util.ArrayList;
import java.util.List;

public class Leetcode_118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if(numRows == 0) return ans;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ans.add(firstRow);

        for(int i=1; i<numRows; i++){
            List<Integer> prev = ans.get(i-1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);
            for(int j=1; j<prev.size(); j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }
            curr.add(1);

            ans.add(curr);
        }
        return ans;   
    }
}
