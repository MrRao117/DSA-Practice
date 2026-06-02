class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int startCol=0, endCol= mat[0].length-1;
        while(startCol<=endCol){
            int maxRow=0;
            // find a mid col
            int midCol =startCol+(endCol-startCol)/2;

            // in that mid col traverse row wise and check for that midCol in which row the max element exist
            for (int row = 0; row < mat.length; row++) {
                if(mat[row][midCol]>=mat[maxRow][midCol]){
                    maxRow=row; // got the max row
                }
            }


            // boolean flags to check if adjacent column element is greater than the mid col
            boolean leftIsBig = midCol-1>=startCol && mat[maxRow][midCol-1]>mat[maxRow][midCol];
            boolean rightIsBig = midCol+1<=endCol && mat[maxRow][midCol+1]>mat[maxRow][midCol];


            if(!leftIsBig && !rightIsBig){ // we got the peak element
                return new int[]{maxRow, midCol};
            }

            else if(leftIsBig){
                endCol=midCol-1;
            }

            else{
                startCol=midCol+1;
            }
        }
        return null;
    }
}