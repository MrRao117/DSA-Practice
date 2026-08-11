class Solution {
     public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        findSubsets(nums, 0, ans, result);
        return result;
    }

     public static void findSubsets(int[] nums, int index, List<Integer> ans, List<List<Integer>> result){
        result.add(new ArrayList<>(ans));
        for (int i = index; i < nums.length; i++) {
            if(i>index && nums[i]==nums[i-1]) continue;
            ans.add(nums[i]);
            findSubsets(nums, i+1, ans, result);
            ans.removeLast();

        }
    }
}