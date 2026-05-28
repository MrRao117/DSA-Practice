class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int startRow=0;
        int startCol=grid[0].length-1;
        while(startRow<grid.length && startCol>=0){
            if(grid[startRow][startCol]<0){    // move left
                count+= grid.length-startRow;
                startCol--;
            }
            else{
                startRow++;  // move bottom
            }
        }
        return count;
    }
}