class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set<Character> set = new HashSet<>();
        int maxLength=0;
        int start=0, end=0;

        while(start<s.length()) {
            if(!set.contains(s.charAt(start))){
                set.add(s.charAt(start));
                maxLength = Math.max(maxLength, start-end+1);
                start++;
            }
            else{
                set.remove(s.charAt(end));
                end++;
            }
        }
        return maxLength;
    }
}