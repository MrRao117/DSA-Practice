class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        findPermutations(nums, visited, new ArrayList<>(), result);
        return result;
    }

    public static void findPermutations(int[] nums, boolean[] visited, List<Integer> ans, List<List<Integer>> result){
        if(ans.size()==nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }


        for(int i=0; i<nums.length; i++){
            if(visited[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !visited[i-1]){
                continue;
            }

            visited[i]= true;
            ans.add(nums[i]);
            findPermutations(nums, visited, ans, result);

            ans.removeLast();
            visited[i] = false;
        }
    }
}