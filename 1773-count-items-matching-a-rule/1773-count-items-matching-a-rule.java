class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int k=0;
        if(Objects.equals(ruleKey, "type")){
            k=0;
        }
        if(Objects.equals(ruleKey, "color")){
            k=1;
        }
        if(Objects.equals(ruleKey, "name")){
            k=2;
        }
        int match=0;
        for (int i = 0; i < items.size(); i++) {
            String s=items.get(i).get(k);
            if(Objects.equals(s, ruleValue)){
                match++;
            }
        }
        return match;
    }
}