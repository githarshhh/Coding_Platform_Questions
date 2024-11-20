import java.util.HashSet;

public class Leetcode_217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(hs.contains(nums[i])) return true;
            else hs.add(nums[i]);
        }

        return false;
    }
}
