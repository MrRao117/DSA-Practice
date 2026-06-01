class Solution {
    public int maxValue(int n, int index, int maxSum) {
    int start=1;
        int end=maxSum;
        int ans=1;
        while(start<=end){
            int mid=start+(end-start)/2;

            long totalSum = calculateSideSum(mid-1, index)+calculateSideSum(mid, n-index);

            if(totalSum<=maxSum){
                start=mid+1;
                ans=mid;
            }
            
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public long calculateSideSum(long x, int cnt){
        if(cnt==0) return 0;
        if(x>=cnt){
            return (x+x-cnt+1)*cnt/2;
        }

        else{
            return (x*(x+1)/2)+cnt-x;
        }
    }
}