class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1!=n2){
            return false;
        }

        int[] a1 = new int[26];
        int[] a2 = new int[26];
        for(int i=0; i<n1; i++){
            int c1 = s.charAt(i)-'a';
            int c2 = t.charAt(i)-'a';
            a1[c1]++;
            a2[c2]++;
        }

        for(int i=0; i<26; i++){
            if(a1[i]!=a2[i]) return false;
        }

        return true;
    }
}