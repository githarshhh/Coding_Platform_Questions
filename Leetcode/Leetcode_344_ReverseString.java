class Leetcode_344_ReverseString {
    public void reverseString(char[] s) {
        int n = s.length;
        reverse(s,0,n-1);
    }

    static void reverse(char[] str, int l, int r){
        if(l>r) return;
        char temp;

        temp = str[l];
        str[l] = str[r];
        str[r] = temp;
        reverse(str, l+1, r-1);

    }
}