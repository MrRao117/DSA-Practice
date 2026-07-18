class Solution {
    public int countHomogenous(String s) {
        int res=0, cur=0, count=0, MOD=1_000_000_007;

        for (int i = 0; i < s.length(); ++i) {
            if(s.charAt(i)==cur) count++;
            else count=1;
            cur=s.charAt(i);
            res = (res+count)%MOD;
        }

        return res;
    }
}