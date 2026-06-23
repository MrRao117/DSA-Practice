class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=0, w2=0;
        StringBuilder ans = new StringBuilder();
        while(w1<word1.length() && w2<word2.length()){
            ans.append(word1.charAt(w1));
            w1++;
            ans.append(word2.charAt(w2));
            w2++;
        }

        while(w1<word1.length()){
            ans.append(word1.charAt(w1));
            w1++;
        }

        while(w2<word2.length()){
            ans.append(word2.charAt(w2));
            w2++;
        }
        return ans.toString();
    }
}