public class Leetcode_1823_FindTheWinnerOfTheCircularGame {
    public int helper(int n, int k){
        if(n == 1) return 0;

        int idx = helper(n-1, k);
        return idx = (idx + k) % n;

    }

    public int findTheWinner(int n, int k) {
       return helper(n, k) + 1;
    }
}
