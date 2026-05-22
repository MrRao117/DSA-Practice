class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int c=image[0].length;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j <= (c-1)/2; j++) {
                if(image[i][j]==image[i][c-j-1]){
                    if(image[i][j]==1){
                        image[i][j]=image[i][c-j-1]=0;
                    }
                    else{
                        image[i][j]=image[i][c-j-1]=1;
                    }
                }
            }
        }
        return image;
    }
}