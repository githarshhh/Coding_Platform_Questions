import java.util.HashSet;

public class Leetcode_1930_UniqueLength3PalindromicSubsequences {
    public int countPalindromicSubsequence(String s) {
        HashSet<String> uniquePallindrome = new HashSet<>();
        int n = s.length();

        for(char ch='a'; ch<='z'; ch++){
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);

            if(first != -1 && last != -1 && first < last){
                HashSet<Character> middleChar = new HashSet<>();

                for(int i=first+1; i<last; i++){
                    middleChar.add(s.charAt(i));
                }

                for(char mid: middleChar){
                    uniquePallindrome.add("" + ch + mid + ch);
                }
            }
        }

        return uniquePallindrome.size();
    }
}
