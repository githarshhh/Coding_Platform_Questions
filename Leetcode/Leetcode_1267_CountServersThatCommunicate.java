public class Leetcode_1267_CountServersThatCommunicate {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rowServerCount = new int[m];
        int[] colServerCount = new int[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1){
                    rowServerCount[i]++;
                    colServerCount[j]++;
                }
            }
        }

        int ans = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((grid[i][j] == 1) && ((rowServerCount[i] > 1) || (colServerCount[j] > 1 ))){
                    ans++;
                }
            }
        }

        return ans;
    }
}
