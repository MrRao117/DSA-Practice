class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int currentCost=0, maxLength=0;

        for (int i = 0; i < s.length(); i++) {
            currentCost+=Math.abs(s.charAt(i)-t.charAt(i));

            if(currentCost>maxCost){
                currentCost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }

            maxLength = Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}