class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row=0, col=0;
        while(row<matrix.length && col<matrix[0].length){
            boolean rowMin = true, colMax = true;

            int num = matrix[row][col];

            // check min in row
            for(int i=0; i<matrix[0].length; i++){
                if(matrix[row][i]<num){
                    rowMin = false;
                    break;
                }
            }

            if(rowMin == true){
                for(int i=0; i<matrix.length; i++){
                    if(matrix[i][col]>num){
                        colMax = false;
                        break;
                    }
                }
            }

            if(rowMin==true && colMax==true){
                list.add(num);
            }

            if(row<matrix.length && col< matrix[0].length){
                col++;
            }
            if(col==matrix[0].length){
                col=0;
                row++;
            }
        }
        return list;
    }
}