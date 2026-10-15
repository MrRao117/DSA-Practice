class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;
       if(digits[n-1]!=9){
        digits[n-1]+=1;
        return digits;
       }

       int count9=0;
       for(int i=0; i<n; i++){
        if(digits[i]==9) count9++;
       }

       if(count9!=n){
        boolean nine=true;
        for(int i=n-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]+=1;
                break;
            }
            digits[i] = (digits[i]+1)%10;;
        }
       }

       else{
        int[] ans = new int[n+1];
        ans[0]=1;
        return ans;
       }
       return digits;
    }
}