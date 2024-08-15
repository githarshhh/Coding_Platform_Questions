import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_17_LetterCombinationsOfAPhoneNumber {
    ArrayList<String> arr = new ArrayList<>();

    public void solve(int idx, String digits, Map<Character,String> mp, String temp){
        if(idx >= digits.length()){
            arr.add(temp);
            return;
        }

        char ch = digits.charAt(idx);
        String str = mp.get(ch);

        for(int i=0; i<str.length(); i++){
            temp += str.charAt(i);
            solve(idx+1, digits, mp, temp);
            temp = temp.substring(0,temp.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return arr;
        String temp = "";

        HashMap<Character,String> Mp = new HashMap<>();
        Mp.put('2',"abc");
        Mp.put('3',"def");
        Mp.put('4',"ghi");
        Mp.put('5',"jkl");
        Mp.put('6',"mno");
        Mp.put('7',"pqrs");
        Mp.put('8',"tuv");
        Mp.put('9',"wxyz");

        solve(0, digits, Mp, temp);
        return arr;
    }
}
