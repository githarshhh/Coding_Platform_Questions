import org.w3c.dom.Node;

public class Leetcode_138_CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        
        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = curr.next.next;
        }

        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node newHead = curr.next;
        Node newCurr = newHead;
        while(curr != null){
            curr.next = newCurr.next;
            curr = curr.next;
            if(curr != null){
                newCurr.next = curr.next;
                newCurr = newCurr.next;
            }
        }

        return newHead;
    }
}
