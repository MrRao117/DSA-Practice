class Solution {
    public int diagonalSum(int[][] mat) {
        int ps=0, ss=0;
        for(int i=0; i<mat.length; i++){
            ps+=mat[i][i];
            ss+=mat[i][mat[0].length-i-1];
        }

        if(mat.length%2==1){
            int mid=mat.length/2;
            ss-=mat[mid][mid];
        }

        return ps+ss;
    }
}