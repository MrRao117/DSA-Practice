class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxWeight=-1, totalWeight=0;
        for (int i = 0; i < weights.length; i++) {
            maxWeight=Math.max(maxWeight, weights[i]);
            totalWeight+=weights[i];
        }
        
        int left=maxWeight, right=totalWeight;
        while(left<=right){
            int mid = left+(right-left)/2;
            int daysNeeded = 1 , currWeight=0;
            for (int i = 0; i < weights.length; i++) {
                if(currWeight+weights[i]>mid){
                    daysNeeded++;
                    currWeight=0;
                }
                currWeight+=weights[i];
            }

            if(daysNeeded>days){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        return left;
    }
}