class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int c=image[0].length;
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < c/2; j++) {
                int temp=image[i][j];
                image[i][j]=image[i][c-j-1];
                image[i][c-j-1]=temp;
            }
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else{
                    image[i][j]=1;
                }
            }
        }

        return image;
    }
}