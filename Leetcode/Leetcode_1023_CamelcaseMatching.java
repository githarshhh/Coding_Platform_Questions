import java.util.ArrayList;
import java.util.List;

public class Leetcode_1023_CamelcaseMatching {
    public boolean isMatches(String str, String pattern){
        int i=0;
        int n=str.length();
        int count=0;

        for(int j=0; j<n; j++){
            if(i<pattern.length() && str.charAt(j) == pattern.charAt(i)) i++;
            else if(str.charAt(j) >= 'A' && str.charAt(j) <= 'Z') count++;
        }
        return (count==0 && i==pattern.length());
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int n = queries.length;

        for(int i=0; i<n; i++){
            arr.add(isMatches(queries[i],pattern));
        }

        return arr;
    }
}
