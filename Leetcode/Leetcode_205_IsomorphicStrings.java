import java.util.HashMap;

public class Leetcode_205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        if(n != t.length()) return false;

        HashMap<Character, Character> mp = new HashMap<>(); 

        for(int i=0; i<n; i++){
            if(!mp.containsKey(t.charAt(i))){
                if(!mp.containsValue(s.charAt(i))){
                    mp.put(t.charAt(i), s.charAt(i));
                }else{
                    return false;
                }
            }else{
                if(mp.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
        }

        return true;
    }
}
