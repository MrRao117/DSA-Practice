class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        int j=0;
        if(ruleKey.equals("type")) j=0;
        if(ruleKey.equals("color")) j=1;
        if(ruleKey.equals("name")) j=2;

        for(int i=0; i<items.size(); i++){
            String s = items.get(i).get(j);
            if(s.equals(ruleValue)) ans++;
        }
        return ans;
    }
}