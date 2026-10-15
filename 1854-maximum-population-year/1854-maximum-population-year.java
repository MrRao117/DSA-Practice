class Solution {
    public int maximumPopulation(int[][] logs) {
        // int[] population = new int[101];
        // for(int i=0; i<logs.length; i++){
        //     int born = logs[i][0];
        //     int death = logs[i][1];
        //     for(int j=born; j<death; j++){
        //         population[j-1950]++;
        //     }
        // }
        // int max = population[0];
        // int year=1950;
        // for(int i=0; i<101; i++){
        //         if(max<population[i]){
        //             max = population[i];
        //             year=i+1950;
        //         }
        // }
        // return year;

        int[] year = new int[101];
        for(int i=0; i<logs.length; i++){
            year[logs[i][0]-1950]++;
            year[logs[i][1]-1950]--;
        }

        int max = 0;
        int curr = 0;
        int minYear = 0;

        for(int i=0; i<101; i++){
            curr+=year[i];
            if(curr>max){
                max=curr;
                minYear = i+1950;
            }
        }
        return minYear;
    }
}