public class Leetcode_1219_PathWithMaximumGold {
    int m,n;

    public int solve(int[][] grid, int i, int j){
        int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};

        if(i >= m || i<0 || j >=n || j<0 || grid[i][j] == 0){
            return 0;
        } 

        int currGold = grid[i][j];
        grid[i][j] = 0;
        
        int maxGold = 0;
        for(int[] direct : directions){
            int new_i = i + direct[0];
            int new_j = j + direct[1];

            maxGold = Math.max(maxGold, solve(grid,new_i,new_j));
        }

        grid[i][j] = currGold;
        return maxGold + currGold;
    }

    public int getMaximumGold(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        int maxGold = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                maxGold = Math.max(maxGold, solve(grid,i,j));
            }
        }

        return maxGold;
    }
}
