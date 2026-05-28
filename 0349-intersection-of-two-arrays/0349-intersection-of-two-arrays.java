class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ans = new int[Math.min(nums1.length,nums2.length)];
        int k=0;
        for(int i=0;i<nums2.length;i++){
            if(i>0 && nums2[i]==nums2[i-1])
                continue;
            if(binarySearch(nums1,nums2[i])){
                ans[k++]=nums2[i];
            }
        }
        return Arrays.copyOf(ans, k);
    }
    
    public boolean binarySearch(int[] nums, int target){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
                return true;
            else if(nums[mid]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return false;
    }
}