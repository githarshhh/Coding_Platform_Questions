public class Leetcode_1732_FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int k=0;

        for(int i=0; i<gain.length; i++){
            k = k + gain[i];
            ans = Math.max(ans,k);
        }

        return ans;
    }
}
