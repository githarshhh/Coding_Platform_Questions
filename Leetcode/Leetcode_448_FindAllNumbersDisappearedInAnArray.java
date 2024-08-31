import java.util.ArrayList;
import java.util.List;

public class Leetcode_448_FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ll = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int idx = Math.abs(nums[i])-1;

            if(nums[idx] < 0) continue;

            nums[idx] *= -1;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                ll.add(i + 1);
            }
        }
        return ll;
    }
}
