import java.util.HashSet;

public class Leetcode_219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();

        int i=0;
        int j=0;

        while(j<nums.length){
           if(Math.abs(i-j) > k){
                hs.remove(nums[i]);
                i++;
           }
           if(hs.contains(nums[j])) return true;

           hs.add(nums[j]);
           j++;
        }

        return false;
    }
}
