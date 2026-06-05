class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            count[arr1[i]]++;
        }

        int index=0;
        // Step 2: Clear out elements in the relative order of arr2
        for(int i: arr2){
            while(count[i]>0){
                arr1[index++]=i;
                count[i]--;
            }
        }
        // Step 3: Collect leftover elements in ascending order
        // Since we loop from 0 to 1000, they are naturally sorted!
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr1[index++]=i;
                count[i]--;
            }
        }
        
        return arr1;
    }
}