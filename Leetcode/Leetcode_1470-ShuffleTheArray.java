public class Leetcode_1470-ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int newNum[] = new int[2*n];
        int i=0;
        int j=n;
        int k=0;

        while(i<n){
            newNum[k] = nums[i];
            newNum[k+1] = nums[j];
            i++;
            j++;
            k+=2; 
        }

        return newNum;

    }
}
