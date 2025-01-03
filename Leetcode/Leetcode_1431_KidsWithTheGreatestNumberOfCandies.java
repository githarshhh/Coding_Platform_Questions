import java.util.ArrayList;
import java.util.List;

public class Leetcode_1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List result = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            max = Math.max(candies[i],max);
        }

        for(int i=0; i<candies.length; i++){
            if( (candies[i] + extraCandies) >= max ){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }
}
