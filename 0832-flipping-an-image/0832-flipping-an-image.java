class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0; i<image.length; i++){
            int j=0, k=image[0].length-1;
            while(j<k){
                int temp = image[i][k];
                image[i][k]=image[i][j];
                image[i][j]=temp;
                image[i][j] = image[i][j]^1;
                image[i][k] = image[i][k]^1;
                j++;k--;
            }
            if(image[0].length%2==1){
                image[i][j]=image[i][j]^1;
            }
        }

        return image;
    }
}