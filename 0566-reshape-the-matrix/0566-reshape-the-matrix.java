class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] newMat = new int[r][c];

        int row=mat.length;
        int col=mat[0].length;
        if((r*c)!=(row*col)){
            return mat;
        }
        int newCol=0;
        int newRow=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                newMat[newRow][newCol]=mat[i][j];
                newCol++;
                if(newCol==c){
                    newCol=0;
                    newRow++;
                }
            }
        }
        return newMat;
    }
}