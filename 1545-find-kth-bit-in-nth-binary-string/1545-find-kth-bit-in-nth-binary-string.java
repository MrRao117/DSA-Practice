class Solution {
    public char findKthBit(int n, int k) {
      String s = "0";
        int i=2;
        while(i<=n){
            s = s + "1" + reverse(invert(s));
            i++;
        }

        return s.charAt(k-1);
    }

    private static String invert(String s){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1') res.append('0');
            else res.append('1');
        }

        return res.toString();
    }

    private static String reverse(String s){
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}