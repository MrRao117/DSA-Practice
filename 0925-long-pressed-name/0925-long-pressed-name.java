class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=0, t=0;
        while(t<typed.length()  ){
            if(n<name.length() && name.charAt(n)==typed.charAt(t)){
                n++;
                t++;
            }
            else if(t>0 && name.charAt(n-1)==typed.charAt(t)){
                t++;
            }
            else{
                return false;
            }
        }

        return n==name.length();
    }
}