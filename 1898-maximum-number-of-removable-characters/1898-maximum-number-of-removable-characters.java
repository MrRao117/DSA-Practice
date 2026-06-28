class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
     int low=0;
        int high = removable.length;
        int ans = 0;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(checkSubsequence(s,p,removable,mid)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return ans;
    }

    public static boolean checkSubsequence(String s, String p, int[] removable, int k){
        boolean[] removed = new boolean[s.length()];
        for (int i = 0; i < k; i++) {
            removed[removable[i]]=true;
        }
        int sInd = 0, pInd = 0;
        while(pInd<p.length() && sInd<s.length()){
            if(removed[sInd]){
                sInd++;
                continue;
            }
            if(s.charAt(sInd)==p.charAt(pInd)){
                pInd++;
            }
            sInd++;
        }
        return pInd==p.length();
       
    }
}