class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int[] temp = nums1.clone();
        Arrays.sort(temp);
        int mod = 1_000_000_007;
        long totalSumDiff = 0;
        int maxSaving = 0;

        for(int i=0; i<nums1.length;i++){
            int originalDiff = Math.abs(nums1[i]-nums2[i]);
            totalSumDiff+=originalDiff;

            int s=0;
            int e=nums1.length-1;
            int target = nums2[i];
            while(s<=e){
                int mid = s+(e-s)/2;
                int c=temp[mid];

                int newDiff = Math.abs(c-target);

                maxSaving = Math.max(maxSaving, originalDiff-newDiff);

                if(c<target)
                    s=mid+1;

                else
                    e=mid-1;
            }
        }
        long result = totalSumDiff-maxSaving;

        return (int) (result%mod);

    }

    
}