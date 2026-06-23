class Solution {
    public boolean checkOnesSegment(String s) {
        boolean foundZero = false;
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);

            if(current=='0'){
                foundZero=true;
            }
            else if(current=='1' && foundZero){
                return false;
            }
        }
        return true;
    }
}