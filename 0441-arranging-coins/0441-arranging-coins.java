class Solution {
    public int arrangeCoins(int n) {
        long start=1;
        long end=n;
        long ans=0;
        while(start<=end){
            long mid=start+(end-start)/2;
            long coinsNeeded= mid*(mid+1)/2;
            if(coinsNeeded==n){
                return (int)mid;
            }
            else if(coinsNeeded<n){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int)ans;
    }
}