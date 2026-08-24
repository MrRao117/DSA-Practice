class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        findComb(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    void findComb(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(current));
            return;
        }

        for(int i=index; i<candidates.length; i++){
            if(candidates[i]>target) break;
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }

            current.add(candidates[i]);
            findComb(candidates, target-candidates[i], i+1, current, ans);

            current.remove(current.size()-1);
        }
    }
    }
