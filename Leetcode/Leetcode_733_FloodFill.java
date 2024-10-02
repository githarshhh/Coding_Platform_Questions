public class Leetcode_733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        int[][] ans = image;
        int ogcolor = image[sr][sc];
        int[] directrow = {-1,0,1,0};
        int[] directcol = {0,1,0,-1};

        dfs(image,ans,sr,sc,ogcolor,newcolor,directrow,directcol);
        return ans;
    }

    private void dfs(int[][] image, int[][] ans, int sr, int sc, int ogcolor, int newcolor, int[] directrow, int[] directcol){
        ans[sr][sc] = newcolor;
        int m = image.length;
        int n = image[0].length;

        for(int i=0; i<4; i++){
            int newRow = sr + directrow[i];
            int newCol = sc + directcol[i];

            if(newRow>=0 && newRow<m && newCol>=0 && newCol<n && image[newRow][newCol]==ogcolor && ans[newRow][newCol]!=newcolor){
                dfs(image,ans,newRow,newCol,ogcolor,newcolor,directrow,directcol);
            }
        }
    }
}
