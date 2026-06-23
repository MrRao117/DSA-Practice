class Solution {
    public boolean validPalindrome(String s) {
     int h=0, t=s.length()-1;
        while(h<=t){
            if(s.charAt(h)==s.charAt(t)){
                h++;
                t--;
            }
            else{

                return isValidPalindrome(s,h+1,t) || isValidPalindrome(s,h,t-1);
            }
        }
        return true;
    }

    public static boolean isValidPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
       
    }
}