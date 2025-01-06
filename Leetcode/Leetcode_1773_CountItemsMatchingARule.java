import java.util.List;

public class Leetcode_1773_CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = -1;
        int ans = 0;


        if(ruleKey.equals("type")){
            idx = 0;
        }else if(ruleKey.equals("color")){
            idx = 1;
        }else{
            idx = 2;
        }

        for(int i=0; i<items.size(); i++){
            if(idx == 0 && items.get(i).get(0).equals(ruleValue)){
                ans++;
            }
            else if(idx == 1 && items.get(i).get(1).equals(ruleValue)){
                ans++;
            }
            else if(idx == 2 && items.get(i).get(2).equals(ruleValue)){
                ans++;
            }
        }

        return ans;
    }
}
