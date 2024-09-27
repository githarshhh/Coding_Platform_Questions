import java.util.HashMap;
import java.util.Stack;

public class Leetcode_496_NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=nums2.length-1; i>=0; i--){
            int element = nums2[i];

            if(s.isEmpty()){
                s.push(element);
                map.put(element,-1);
                continue;
            }

            if(s.peek() > element){
                map.put(element, s.peek());
                s.push(element);
                continue;
            }

    
            while(!s.isEmpty() && s.peek() <= element){
                s.pop();
            }

            if(s.isEmpty()){
                map.put(element,-1);
                s.push(element);
            }else{
                map.put(element, s.peek());
                s.push(element);
            }
        }

        for(int i=0; i<res.length; i++){
            res[i] = map.get(nums1[i]);
        }

        return res;
    }
}
