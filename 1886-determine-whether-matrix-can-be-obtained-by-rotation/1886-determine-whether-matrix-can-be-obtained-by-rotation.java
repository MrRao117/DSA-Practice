class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count=0;
        int a=1;
        while(a<=4) {

            int n = mat.length * mat[0].length;
            int k = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == target[i][j]) {
                        k++;
                    }
                }
            }
            if (n == k) {
                return true;
            }


            for (int i = 0; i < mat.length; i++) {
                for (int j = i; j < mat[0].length; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }

            for (int i = 0; i < mat.length; i++) {
                int left = 0;
                int right = mat[0].length - 1;
                while (left < right) {
                    int temp = mat[i][left];
                    mat[i][left] = mat[i][right];
                    mat[i][right] = temp;
                    left++;
                    right--;
                }
            }


            a++;
        }
        return false;
    }
}