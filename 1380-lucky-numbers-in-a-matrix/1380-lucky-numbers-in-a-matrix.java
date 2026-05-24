class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result=new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int rowMin=matrix[i][0];
            int minCol=0;
            for (int j = 0; j < matrix[0].length; j++) {
                if(rowMin>matrix[i][j]){
                    rowMin=matrix[i][j];
                    minCol=j;
                }
            }

            int colMax=matrix[0][minCol];
            for (int j = 0; j < matrix.length; j++) {
                if(colMax<matrix[j][minCol]){
                    colMax=matrix[j][minCol];
                }
            }

            if(colMax==rowMin){
                result.add(colMax);
            }
            
        }
        return result;
    }
}