class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< gain.length;i++){
            ans[i+1]=ans[i]+gain[i];

        }
        for (int i = 0; i < ans.length; i++) {
            if(max<ans[i])
                max=ans[i];
        }
        return max;
    }
}