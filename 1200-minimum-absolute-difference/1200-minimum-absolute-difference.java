class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
            Arrays.sort(arr);

            int minDiff = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length-1; i++) {
                    int currDiff = (arr[i+1]-arr[i]);

                    if(currDiff<minDiff){
                        minDiff=currDiff;
                        list.clear();
                        list.add(Arrays.asList(arr[i],arr[i+1]));
                    }
                    else if(currDiff==minDiff){
                        list.add(Arrays.asList(arr[i],arr[i+1]));
                    }
            }

            return list;
    }
}