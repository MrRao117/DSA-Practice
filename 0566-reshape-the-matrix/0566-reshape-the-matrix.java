class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length, col = mat[0].length;
        if(r*c!=row*col) return mat;
        int[][] ans = new int[r][c];
        int[] temp = new int[row*col];
        int t=0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                temp[t++] = mat[i][j];
            }
        }

        t=0;

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                ans[i][j] = temp[t];
                t++;
            }
        }

        return ans;
    }
}