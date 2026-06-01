class Solution {
    public int minimumCost(int[] cost) {
        int minCost=0;
        int count=0;
        Arrays.sort(cost);
        for (int i = cost.length-1; i >= 0; i--) {
            minCost+=cost[i];
            count++;
            if(count>=2){
                i--;
                count=0;
            }
        }
        return minCost;
    }
}