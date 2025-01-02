import java.util.HashSet;

public class Leetcode_2559_CountVowelStringsInRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        HashSet<Character> hs = new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');

        int[] prefix = new int[words.length];

        for(int i=0; i<words.length; i++){
            StringBuilder check = new StringBuilder(words[i]);
            boolean isVowel = false;
            
            if(hs.contains(check.charAt(0)) && hs.contains(check.charAt(check.length()-1))){
                isVowel = true;
            }

            if(i == 0){
                prefix[0] = (isVowel?1:0);
            }else{
            prefix[i] = prefix[i-1] + (isVowel?1:0);
            }
        }

        for(int i=0; i<queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            
            if (start == 0) {
                ans[i] = prefix[end];
            } else {
                ans[i] = prefix[end] - prefix[start - 1];
            }
        }

        return ans;
    }
}
