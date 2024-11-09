import java.util.LinkedHashSet;

public class Leetcode_26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        
        for(int i=0; i<n; i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
        }
        
        int j = 0;
        for(int k : hs){
            nums[j] = k;
            j++;
        }
        
        return hs.size();  
    }
}
