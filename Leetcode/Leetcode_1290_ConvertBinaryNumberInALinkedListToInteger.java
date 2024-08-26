public class Leetcode_1290_ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        int n = 0;
        int sum = 0;
        ListNode temp = head;

        while(temp!=null){
            n++;
            temp = temp.next;
        }

        temp = head;
        while(temp!=null){
            sum = sum + temp.val*(int)Math.pow(2,--n);
            temp = temp.next;
        }
        return sum;
    }
}
