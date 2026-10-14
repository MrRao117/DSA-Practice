class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        for(int i=0; i<sentence.length(); i++){
            int ch = sentence.charAt(i)-'a';
            count[ch]++;
        }
        for(int i=0; i<count.length; i++){
            if(count[i]==0){
                return false;
            }
        }
        return true;
    }
}
