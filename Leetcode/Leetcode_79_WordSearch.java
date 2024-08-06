public class Leetcode_79_WordSearch {
    int m, n;

    public boolean find(char[][] board, int i, int j, int idx, String word){
        if(idx == word.length()) return true;
        if(i<0 || j<0 || i>=m || j>=n || board[i][j] != word.charAt(idx)) return false;
    
        char temp = board[i][j];
        board[i][j] = '$';
        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int[] direction: directions){
            int new_i = i + direction[0];
            int new_j = j + direction[1];
            if(find(board,new_i,new_j,idx+1,word)) return true;
        }
        board[i][j] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0) && find(board,i,j,0,word))
                    return true;
            }
        }

        return false;
    }
}