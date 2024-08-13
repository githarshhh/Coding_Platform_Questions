public class Leetcode_394_DecodeString {
    String helper(int[] i, String str){
        String ans ="";
        int n = 0;

        while( i[0]<str.length() ){
            char curr = str.charAt(i[0]);

            if(curr>='0' && curr<='9'){
                n = n*10 + curr - '0';
            }
            else if(curr == '['){
                i[0]++;
                String temp = helper(i, str);
                while(n>0){
                    ans += temp;
                    n--;
                }
            }
            else if(curr == ']') return ans;
            else{
                ans += curr;
            }
            i[0]++;
        }
        return ans;
    }


    public String decodeString(String s) {
        int[] i = new int[] {0};
        return helper(i,s);
    }
}
