public class Leetcode_1381_DesignAStackWithIncrementOperation {
    int[] arr;
    int pp;
    int size;
    int mxsize;

    public Leetcode_1381_DesignAStackWithIncrementOperation(int maxSize) {
        mxsize = maxSize;
        arr = new int[mxsize];
        pp = mxsize-1;
        size = 0;
    }
    
    public void push(int x) {
        if(pp >= 0){
            arr[pp] = x;
            pp--;
            size++;
        }
    }
    
    public int pop() {
        if(size == 0){
            return -1;
        }
        size--;
        pp++;
        return arr[pp];
    }
    
    public void increment(int k, int val) {
        for(int i=0; k<size? i<k: i<size; i++){
            arr[mxsize-i-1] = arr[mxsize-i-1] + val;
        }
    }
}
