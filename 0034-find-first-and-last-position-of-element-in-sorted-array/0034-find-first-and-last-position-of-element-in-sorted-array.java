class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1, -1};
        int start=findPosition(nums, target, true);
        int end=findPosition(nums, target, false);
        ans[0]=start; ans[1]=end;
        return ans;
    }

    public int findPosition(int[] arr, int target, boolean findStartIndex){
        int s=0, e=arr.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<target){
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else {
                ans = mid;
                if (findStartIndex) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}