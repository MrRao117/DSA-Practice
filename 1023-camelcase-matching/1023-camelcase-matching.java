class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            ans.add(isMatch(queries[i],pattern));
        }
        return ans;
    }
    
    private static boolean isMatch(String query, String pattern){
        int j=0;

        for (int i = 0; i < query.length(); i++) {
            if(j<pattern.length() && query.charAt(i)==pattern.charAt(j)) j++;
            else if (Character.isUpperCase(query.charAt(i))) {
                return false;
            }
        }

        return j==pattern.length();
    }
}