class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1') ones++;
        }

       
        
        int ans=ones;
        s = "1"+s+"1";
        int n=s.length();

        int i=0;

        while(i<n && s.charAt(i)=='1'){
            i++;
        }

        int leftZero = 0;
        while(i<n && s.charAt(i)=='0'){
            i++;
            leftZero++;
        }

        while(i<n){

            int midOnes = 0;
            while (i<n && s.charAt(i)=='1'){
                midOnes++;
                i++;
            }

            if(midOnes==0) break;

            int rightZero =0;
            while(i<n && s.charAt(i)=='0'){
                rightZero++;
                i++;
            }

            if(rightZero==0) break;
            int gain = leftZero+ rightZero;
            ans = Math.max(ans, ones+gain);

            leftZero=rightZero;
        }

        return ans;
    }
}