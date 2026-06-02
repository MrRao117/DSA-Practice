class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]){ // we are int the rotated side of the array, we have to go to the original starting of the array
                s=mid+1;
            }

            else if(nums[mid]<nums[e]){  // we are in the correct side of the line
                e=mid;
            }

            else{ // we found the duplicate 
                e--;
            }
        }
        return nums[s];
    }
}