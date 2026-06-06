class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return arr;

        // Step 1: Clone the array
        int[] sortedArr = arr.clone();
        
        // Step 2: Sort the new array
        Arrays.sort(sortedArr);
        
        // Create an array to map unique values to ranks on the fly
        // We will assign ranks to sortedArr in-place to save memory!
        int[] uniqueRanks = new int[sortedArr.length];
        int rank = 1;
        uniqueRanks[0] = rank;

        // Loop to pre-calculate the rank for each position in the sorted array
        for (int i = 1; i < sortedArr.length; i++) {
            // If the current number is different from the previous one, increment the rank
            if (sortedArr[i] != sortedArr[i - 1]) {
                rank++;
            }
            uniqueRanks[i] = rank;
        }

        // Step 3: Match original elements to their calculated ranks using Binary Search
        // Binary Search is incredibly fast (O(log N)) and uses pure array mechanics!
        for (int i = 0; i < arr.length; i++) {
            int sortedIndex = Arrays.binarySearch(sortedArr, arr[i]);
            arr[i] = uniqueRanks[sortedIndex];
        }
        
        return arr;
    }
}