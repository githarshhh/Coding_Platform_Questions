import java.util.ArrayList;

public class Leetcode_1389_CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> targetList = new ArrayList<>();
        int target[] =  new int[nums.length];
        for(int i=0; i<index.length; i++){
            targetList.add(index[i],nums[i]);
        }
        for(int i=0; i<target.length; i++){
            target[i] = targetList.get(i);
        }
        return target;
    }
}
