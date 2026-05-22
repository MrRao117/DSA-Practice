class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mtx=new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int rowIndex=indices[i][0];
            int colIndex=indices[i][1];
            // row increment
            for(int j=0;j<n;j++){
                mtx[rowIndex][j]++;
            }
            // column increment
            for(int k=0;k<m;k++){
                mtx[k][colIndex]++;
            }
        }
        int odd=0;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                if(mtx[i][j]%2!=0){
                    odd++;
                }
            }
        }
        return odd;
    }
}