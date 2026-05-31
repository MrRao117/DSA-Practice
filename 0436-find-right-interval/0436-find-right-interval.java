class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] ans=new int[intervals.length];
        int[][] track = new int[intervals.length][2];
        for(int i=0;i<intervals.length;i++){
            track[i][0]=intervals[i][0];
            track[i][1]=i;
        }

        Arrays.sort(track,(a, b) -> Integer.compare(a[0], b[0]));

        for(int i=0;i<intervals.length;i++){
            int targetEnd=intervals[i][1];
            ans[i]=binarySearch(track, targetEnd);
        }

        return ans;
    }

    public int binarySearch(int[][] trace, int target){
        int s=0;
        int e=trace.length-1;
        int result=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(trace[mid][0]>=target){
                result=trace[mid][1];
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return result;
    }
}