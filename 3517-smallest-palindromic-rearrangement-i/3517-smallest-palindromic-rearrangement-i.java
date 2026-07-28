class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s;

        int n = s.length();
        int halfLen = n/2;

        char[] halfChar = s.substring(0,halfLen).toCharArray();
        Arrays.sort(halfChar);

        StringBuilder left = new StringBuilder(new String(halfChar));

        String mid = (n%2==1) ? String.valueOf(s.charAt(halfLen)) : "";

        StringBuilder right = new StringBuilder(left);

        return left.append(mid).append(right.reverse()).toString();
    }
}