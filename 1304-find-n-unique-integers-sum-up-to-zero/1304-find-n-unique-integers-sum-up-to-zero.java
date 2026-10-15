class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if(n%2==0){
            int count = -n/2;
            for(int i=0; i<n; i++){
                if(count==0) count++;
                ans[i] = count;
                count++;
            }
        }
        else{
            int count = -n/2;
            for(int i=0; i<n; i++){
                ans[i]=count;
                count++;
            }
        }

        return ans;
    }
}