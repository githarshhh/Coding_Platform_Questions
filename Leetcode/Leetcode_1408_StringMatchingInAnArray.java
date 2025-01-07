import java.util.ArrayList;
import java.util.List;

public class Leetcode_1408_StringMatchingInAnArray {
    public List<String> stringMatching(String[] words) {
        List<String> arr = new ArrayList<>();

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i==j) continue;

                if(words[j].length()<words[i].length() && words[i].contains(words[j])){
                    if(!arr.contains(words[j])){
                        arr.add(words[j]);
                    }
                }
            }
        }

        return arr;
    }
}
