class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int k=1;
        int startCol=0, endCol=n-1, startRow=0, endRow=n-1;
        while(startRow<=endRow && startCol<=endCol){
            for (int i = startCol; i <=endCol ; i++) {
                mat[startRow][i]=k;
                k++;
            }

            for (int i = startRow+1; i <=endRow ; i++) {
                mat[i][endCol]=k;
                k++;
            }

            for (int i = endCol-1; i >=startCol ; i--) {
                mat[endRow][i]=k;
                k++;
            }
            for (int i = endRow-1; i >startRow; i--) {
                mat[i][startCol]=k;
                k++;
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        return mat;
    }
}