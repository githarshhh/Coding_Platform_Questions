import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_933_NumberOfRecentCalls {
    Queue<Integer> queue;

    public Leetcode_933_NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(t-3000 > queue.peek()){
            queue.poll();
        }
        return queue.size();
    }
}
