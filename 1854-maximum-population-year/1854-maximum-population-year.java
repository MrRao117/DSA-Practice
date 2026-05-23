class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] yearCounts=new int[2051];

        for (int i = 0; i < logs.length; i++) {
            int birth=logs[i][0];
            int death=logs[i][1];
            for (int j = birth; j < death; j++) {
                yearCounts[j]++;
            }
        }
        int earliestYear=0;
        int maxPopulation=0;
        for (int i = 0; i < 2051; i++) {
            if(maxPopulation<yearCounts[i]){
                maxPopulation=yearCounts[i];
                earliestYear=i;
            }
        }
        return earliestYear;
    }
}