class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];

        for(int i=0; i<indices.length; i++){
            int row = indices[i][0];
            int col = indices[i][1];
            for(int j=0; j<mat[0].length; j++){
                mat[row][j]++;
            }

            for(int k=0; k<mat.length; k++){
                mat[k][col]++;
            }
        }

        int odd=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]%2==1) odd++;
            }
        }

        return odd;
    }
}