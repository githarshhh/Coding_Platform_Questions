public class Leetcode_1545_FindKthBitinNthBinaryString {
    public char findKthBit(int n, int k) {
        String[] strs = new String[n];
        strs[0] = "0";
        for(int i=1; i<n; i++){
            strs[i] = strs[i-1] + "1" + reverse(invert(strs[i-1]));
        }
        return strs[n-1].charAt(k-1);
    }

    private String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    private String invert(String str){
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ch.length; i++){
            if(ch[i] == '0'){
                sb.append('1');
            }else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
}
