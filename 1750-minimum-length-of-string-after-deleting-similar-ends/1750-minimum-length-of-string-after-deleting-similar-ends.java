class Solution {
    public int minimumLength(String s) {
        int start=0, end=s.length()-1;

        while(start<end && s.charAt(start)==s.charAt(end)){
            char tar = s.charAt(start);

            while(start<=end && s.charAt(start)==tar){
                start++;
            }

            while(end>=start && s.charAt(end)==tar){
                end--;
            }
        }

        return end-start+1;
    }
}