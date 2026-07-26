class Solution {
    public int findMinDifference(List<String> timePoints) {
        if(timePoints.size()>1440) return 0;

        int[] minutes = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String t = timePoints.get(i);
            int h = Integer.parseInt(t.substring(0,2));
            int m = Integer.parseInt(t.substring(3,5));
            minutes[i] = h*60+m;
        }

        Arrays.sort(minutes);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < minutes.length; i++) {
            minDiff = Math.min(minDiff, minutes[i]-minutes[i-1]);

        }

        // wrap around time
        int wapDiff = (1440-minutes[minutes.length-1])+minutes[0];

        minDiff = Math.min(minDiff,wapDiff);
        return minDiff;
    }
}