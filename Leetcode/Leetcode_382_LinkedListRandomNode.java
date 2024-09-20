import java.util.ArrayList;

public class Leetcode_382_LinkedListRandomNode {
    ArrayList<Integer> arr = new ArrayList<>();

    public Solution(ListNode head) {
        ListNode temp = head;

        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
    }
    
    public int getRandom() {
        int n = arr.size();
        int index = (int) (Math.random() * n);

        return arr.get(index);
    }
}
