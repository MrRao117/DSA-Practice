class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];

        for(int i=0; i<logs.length; i++){
            int born = logs[i][0];
            int death = logs[i][1];
            for(int j=born; j<death; j++){
                population[j-1950]++;
            }
        }

        int max = population[0];
        int year=1950;
        for(int i=0; i<101; i++){
                if(max<population[i]){
                    max = population[i];
                    year=i+1950;
                }
        }

        return year;
    }
}