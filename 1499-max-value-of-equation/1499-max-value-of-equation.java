class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        int n=points.length;
        int maxValue=Integer.MIN_VALUE;

        int[] window = new int[n];
        int head=0;
        int tail=0;

        for(int j=0;j<n;j++){
            while(head<tail && (points[j][0]-points[window[head]][0])>k){
                head++;
            }

            if(head<tail){
                int i=window[head];
                int currentValue = (points[i][1]-points[i][0]+points[j][1]+points[j][0]);
                maxValue = Math.max(maxValue, currentValue);
            }

            int currentDiff = points[j][1]-points[j][0];
            while(head<tail){
                int backIdx = window[tail-1];
                int backDiff = points[backIdx][1]-points[backIdx][0];

                if(currentDiff>=backDiff){
                    tail--;
                }
                else{
                    break;
                }
            }

            window[tail]=j;
            tail++;
        }
        return maxValue;
    }
}