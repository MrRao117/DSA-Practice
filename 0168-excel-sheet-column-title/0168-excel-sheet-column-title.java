class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        while(columnNumber>0){
            columnNumber-=1;
            int r = columnNumber%26;
            ans.append((char) ('A' + r));
            columnNumber/=26;
        }

        return ans.reverse().toString();
    }
}