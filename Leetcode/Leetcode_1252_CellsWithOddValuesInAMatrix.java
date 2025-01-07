public class Leetcode_1252_CellsWithOddValuesInAMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        int count = 0;

        for(int i=0; i<indices.length; i++){         //incrementing the values in matrix
            int k = indices[i][0];
            for(int j=0; j<n; j++){      //incrementing the specified row 
                matrix[k][j]++;
            }
            
            int l = indices[i][1];
            for(int j=0; j<m; j++){      //incrementing the specified column
                matrix[j][l]++;
            }           
        }

        for(int i=0; i<m; i++){          //counting the no. of odds
            for(int j=0; j<n; j++){
                if(matrix[i][j] % 2 == 1){
                    count++;
                }
            }
        }

        return count;
    }
}
