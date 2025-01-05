public class Leetcode_1832_CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String s) {
        boolean arr[] = new boolean[26];   //create array initialised with false in every index
       
        for(int i=0; i<s.length(); i++){   //replaces false with true when a alphabet appears
             arr[ s.charAt(i) - 'a'] = true ;
           }
    
        for(int i=0; i<26; i++){        //checks if still any alphabet has not appeared
            if(arr[i]==false){
                return false;
                }
            }
           return true;        //returns true if every alphabet has appeared
        }
}
