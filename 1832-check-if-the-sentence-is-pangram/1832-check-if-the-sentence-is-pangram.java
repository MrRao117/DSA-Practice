class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count= new int[26];
        int n=sentence.length();
        if(n<26){
            return false;
        }
        else {
            for (int i = 0; i < n; i++) {
                char ch=sentence.charAt(i);
                count[ch-'a']++;
            }
            for (int i = 0; i < count.length; i++) {
                if(count[i]<1){
                    return false;
                }
            }
            return true;
        }
    }
}