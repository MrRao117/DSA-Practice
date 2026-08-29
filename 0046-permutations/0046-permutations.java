class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        findPermutation(nums, visited, new ArrayList<>(), result);
        return result;
    }

    public static void findPermutation(int[] nums, boolean[] visited, List<Integer> current, List<List<Integer>> result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(visited[i]) continue;

            visited[i]=true;
            current.add(nums[i]);

            findPermutation(nums, visited, current, result);
            current.removeLast();
            visited[i]=false; 
    }
}}