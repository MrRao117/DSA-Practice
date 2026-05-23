class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] yearCounts=new int[2051];

        for (int i = 0; i < logs.length; i++) {
            yearCounts[logs[i][0]]++;
            yearCounts[logs[i][1]]--;
        }

        int maxPopulation=0, earliestYear=1950, currentPopulation=0;
        for (int i = 0; i < 2051; i++) {
            currentPopulation+=yearCounts[i];

            if(currentPopulation>maxPopulation){
                maxPopulation=currentPopulation;
                earliestYear=i;
            }
        }
        return earliestYear;
    }
}