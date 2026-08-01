class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals, (int[] a,int[] b) -> Integer.compare(a[0],b[0]));

        List<int[]> ans = new ArrayList<>();

        int[] currentInterval = intervals[0];
        ans.add(currentInterval);

        for(int[] interval: intervals){
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(currentEnd>=nextStart){
                currentInterval[1]=Math.max(currentEnd,nextEnd);
            }

            else{
                currentInterval = interval;
                ans.add(currentInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}