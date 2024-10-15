public class Leetcode_901_OnlineStockSpan {
    private Stack<int[]> stk;
    public StockSpanner() {
        this.stk = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        while(!stk.isEmpty() && stk.peek()[0] <= price){
            count +=  stk.pop()[1];
        }
        stk.push(new int[]{price,count});
        return count;
    }
}
