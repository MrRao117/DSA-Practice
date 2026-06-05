class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
         List<List<Integer>> list = new ArrayList<>();
            Arrays.sort(arr);
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length-1; i++) {
                    int currDiff = Math.abs(arr[i]-arr[i+1]);
                    minDiff=Math.min(minDiff, currDiff);
            }
            for (int i = 0; i < arr.length-1; i++) {
                int diff=Math.abs(arr[i]-arr[i+1]);
                if(diff ==  minDiff){
                    List<Integer> row = new ArrayList<>();
                    row.add(arr[i]);
                    row.add(arr[i+1]);
                    list.add(row);
                }
            }
            return list;
    }
}