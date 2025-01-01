public class Leetcode_1422_MaximumScoreAfterSplittingAString {
    public int maxScore(String s) {
        int max = 0;

        for(int i=1; i<s.length(); i++){
            int count = 0;

            StringBuilder left = new StringBuilder();
            for(int j=0; j<i; j++){
                left.append(s.charAt(j));
                
                if(s.charAt(j) == '0'){
                    count++;
                }
            }

            StringBuilder right = new StringBuilder();
            for(int j=i; j<s.length(); j++){
                right.append(s.charAt(j));

                if(s.charAt(j) == '1'){
                    count++;
                }
            }

            max = Math.max(max,count);
        }

        return max;                                    
    }
}
