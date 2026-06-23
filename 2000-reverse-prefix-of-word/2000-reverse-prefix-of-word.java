class Solution {
    public String reversePrefix(String word, char ch) {
         StringBuilder sb = new StringBuilder(word);
        int n=word.indexOf(ch);
        int l=0, r=n;
        while(l<=r){
            char cl=sb.charAt(l);
            char cr=sb.charAt(r);
            sb.setCharAt(l,cr);
            sb.setCharAt(r,cl);
            l++;
            r--;
        }
        return sb.toString();
    }
}