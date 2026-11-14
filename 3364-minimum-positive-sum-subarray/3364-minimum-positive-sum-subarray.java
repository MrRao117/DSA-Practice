class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int windowSize = r;
        int start = 0;
        int minSum=Integer.MAX_VALUE;
        while(windowSize>=l){
            int sum = 0;
            int end = start+windowSize;
            for(int i=start; i<end; i++){
                sum+=nums.get(i);
            }
            if(sum<=0){
                sum=0;
            }else{
                minSum = Math.min(minSum, sum);
            }
            if(end==nums.size()){
                windowSize--;
                start=0;
            }else{
                start++;
            }
            
        }

        return minSum==Integer.MAX_VALUE? -1 : minSum;
        
    }
}