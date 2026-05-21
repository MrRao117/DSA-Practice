class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            // upper bound
            start=Math.max(start, nums[i]); // in the end of the loop this will contain the max item from the array

            end+=nums[i];
        }

        // binary search
        while(start<end){
            // try for the middle as the potential answer
            int mid=start + (end-start)/2;

            // calculate how many pieces we can divide this in with the max sum
            int sum=0;
            int pieces=1;
            for(int num: nums){
                if(sum+num>mid){
                    // you can not add this in subarray, make new one
                    // say you add this in num, then sum=num
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }

            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }

        return end; // here start==end
    }
}