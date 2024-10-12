import java.util.Stack;

public class Leetcode_907_SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int nse[] = new int[n];
        int pse[] = new int[n];
        long total = 0;
        int mod = (int)(1e9 + 7);

        nseFun(arr,nse);
        pseFun(arr,pse);

        for(int i=0; i<n; i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            total = (total + (left * right % mod) * arr[i] % mod) % mod;
        }

        return (int) total;
    }

    private void nseFun(int[] arr, int[] nse){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            nse[i] = stk.isEmpty() ? n : stk.peek();
            stk.push(i);
        }
    }

    private void pseFun(int[] arr, int[] pse){
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
                stk.pop();
            }
            pse[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
    }
}
