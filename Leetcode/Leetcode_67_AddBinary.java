public class Leetcode_67_AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while(i>=0 || j>=0 || carry != 0){
            int sum = carry;

            if(i>=0){
                sum += a.charAt(i) - '0';
                i--;
            }

            if(j>=0){
                sum += b.charAt(j) - '0';
                j--;
            }

            ans.append(sum % 2);
            carry = sum/2;
        }

        return ans.reverse().toString();
    }
}
