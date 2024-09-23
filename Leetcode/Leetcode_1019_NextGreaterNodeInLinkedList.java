import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leetcode_1019_NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        ListNode curr = head;

        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }

        int answer[] = new int[arr.size()];

        for(int i=0; i<arr.size(); i++){
            while(!stk.isEmpty() && arr.get(i) > arr.get(stk.peek())){
                answer[stk.pop()] = arr.get(i);
            }
            stk.push(i);
        }

        return answer;
    }
}
