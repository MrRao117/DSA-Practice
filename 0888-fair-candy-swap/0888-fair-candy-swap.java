class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int SA=0,  SB=0;
        for (int i = 0; i < aliceSizes.length; i++) {
            SA+=aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            SB+=bobSizes[i];
        }
        int target = (SA+SB)/2;
        boolean[] track = new boolean[100001];
        int[] ans = new int[2];
        for (int i = 0; i < bobSizes.length; i++) {
            track[bobSizes[i]]=true; 
        }
        for (int i = 0; i < aliceSizes.length; i++) {
            int y = target-SA+aliceSizes[i]; 
            if(y>=0 && y<=100000){
            if(track[y]==true){ 
                ans[0]=aliceSizes[i];
                ans[1]=y;
            }
            }
        }
        return ans;
    }
}