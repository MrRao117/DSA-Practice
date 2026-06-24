class Solution {
    public int lengthOfLastWord(String s) {
         int end=s.length()-1;
        int length=0;
        while(end>=0){
            if(length>0 && s.charAt(end)==' '){
                break;
            }
            if(s.charAt(end) == ' '){
                end--;
            }
            else{
                length++;
                end--;
            }
        }
        return length;
    }
}