public class Leetcode_171_ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int num = 0;
        int n = s.length();

        for(int i=0; i<n; i++){
            num = num * 26 + (s.charAt(i) - '@');
        }

        return num;
    }
}
