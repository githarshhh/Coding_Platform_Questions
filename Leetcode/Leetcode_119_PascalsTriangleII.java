import java.util.ArrayList;
import java.util.List;

public class Leetcode_119_PascalsTriangleII {
    public List<Integer> getRow(int idx) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        if(idx==0) return firstRow;

        ans.add(firstRow);

        for(int i=1; i<=idx; i++){
            List<Integer> prev = ans.get(i-1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);

            for(int j=1; j<prev.size(); j++){
                curr.add(prev.get(j-1) + prev.get(j));
            }

            curr.add(1);
            ans.add(curr);
        }

        return ans.get(idx);
    }
}
