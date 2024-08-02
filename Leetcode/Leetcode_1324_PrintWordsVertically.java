import java.util.Arrays;
import java.util.List;

public class Leetcode_1324_PrintWordsVertically {
    public List<String> printVertically(String s) {
        int max = 0;
        String[] words = s.split(" ");                  //calculating the max element
        for(int i=0; i<words.length; i++){
            if(words[i].length() > max){
                max = words[i].length();
            }
        }

        // String[] words = s.split(" ");              //adding blank spaces in words
        for(int i=0; i<words.length; i++){
            int wordlength = words[i].length();
            while(wordlength < max){
                words[i] += " ";
                wordlength++;
            }
        }

        String[] ans = new String[max];             //storing the main alphabets in array
        for (int i = 0; i < max; i++) {
            ans[i] = "";                            // Initialize the string
        }
        for(int i=0; i<max; i++){
            for(int j=0; j<words.length; j++){
                ans[i] += words[j].charAt(i);
            }
        }

        int check = 0;              
        for(int i=0; i<ans.length; i++){          //removing the trailing spaces
            int k = ans[i].length();
            String str = "";
            while(k>0 && ans[i].charAt(k-1) == ' '){
                k--;
            }
            ans[i] = ans[i].substring(0,k);
        }

        return Arrays.asList(ans);

    }
}

