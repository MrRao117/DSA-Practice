class Solution {
     public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        findSubset(nums, ans, 0, result);
        return result;
    }

    public static void findSubset(int[] nums, List<Integer> ans, int index, List<List<Integer>> result){
        if(index==nums.length){
             result.add(new ArrayList<>(ans));
             return;
        }
        ans.add(nums[index]);
        findSubset(nums, ans, index+1, result);
        ans.removeLast();
        findSubset(nums, ans, index+1, result);
    }
}