public class ReverseFirstKElementsOfQueue {
    
}public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
    int i = 0;
    Stack<Integer> stk = new Stack();
    
    while(i<k){
        stk.push(q.poll());
        i++;
    }
    
    while(!stk.isEmpty()){
        q.add(stk.pop());
    }
    
    i=0;
    
    while(i<q.size()-k){
        q.add(q.poll());
        i++;
    }
    
    return q;

}
