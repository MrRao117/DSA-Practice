class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][10];
        boolean[][] cols = new boolean[9][10];
        boolean[][] box = new boolean[9][10];
        for(int i = 0; i<9; i++){
            for(int j=0; j<9; j++){
                
                char ch = board[i][j];
                if(ch=='.') continue;
                int num = ch-'0';
                int boxIdx = (i/3)*3+(j/3);
                if(rows[i][num] || cols[j][num] || box[boxIdx][num]) return false;

                rows[i][num] = true;
                cols[j][num] = true;
                box[boxIdx][num] = true;
            }
        }

        return true;
    }
}