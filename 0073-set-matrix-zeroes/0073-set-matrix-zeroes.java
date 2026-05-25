class Solution {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int cols= matrix[0].length;

        boolean firstRowHasZero=false;
        boolean firstColHasZero=false;

        // check if first row has zero
        for (int i = 0; i < cols; i++) {
            if(matrix[0][i]==0){
                firstRowHasZero=true;
                break;
            }
        }

        // check if first col has zero
        for (int i = 0; i < row; i++) {
            if(matrix[i][0]==0){
                firstColHasZero=true;
                break;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < cols; j++) {
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < cols; j++) {
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        
        if(firstRowHasZero){
            for (int i = 0; i < cols; i++) {
                matrix[0][i]=0;
            }
        }
        if(firstColHasZero){
            for (int i = 0; i < row; i++) {
                matrix[i][0]=0;
            }
        }
    }
}