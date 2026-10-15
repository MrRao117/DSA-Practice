class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        // int count0A=0, count0B=0, count1A=0, count1B=0;

        // for(int i=0; i<mat.length; i++){
        //     for(int j=0; j<mat[0].length; j++){
        //         if(mat[i][j]==0) count0A++;
        //         else count1A++;
        //     }
        // }

        // for(int i=0; i<target.length; i++){
        //     for(int j=0; j<target[0].length; j++){
        //         if(target[i][j]==0) count0B++;
        //         else count1B++;
        //     }
        // }

        // if(count0A!=count0B || count1A!=count1B) return false;

        int n = mat.length;

        boolean rot0 = true, rot90 = true, rot180 = true, rot270 = true;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]!=target[i][j]) rot0 = false;
                if(mat[i][j]!=target[j][n-1-i]) rot90=false;
                if(mat[i][j]!=target[n-i-1][n-j-1]) rot180=false;;
                if(mat[i][j]!=target[n-j-1][i]) rot270=false;
            }
        }

        return rot0 || rot90 || rot180 || rot270;
    }
}