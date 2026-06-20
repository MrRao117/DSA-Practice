class Solution {
    public boolean halvesAreAlike(String s) {
        int l = s.length();
        String a = s.substring(0,l/2);
        String b = s.substring(l/2,l);

        int countA=0, countB=0;
        for (int i = 0; i < a.length(); i++) {
            char av = a.charAt(i);
            char bv = b.charAt(i);

            if(av=='a' || av=='e' || av=='i' || av=='o' || av=='u' || av=='A' || av=='E' || av=='I' || av=='O' || av=='U'){
                countA++;
            }

            if(bv=='a' || bv=='e' || bv=='i' || bv=='o' || bv=='u' || bv=='A' || bv=='E' || bv=='I' || bv=='O' || bv=='U' ){
                countB++;
            }
        }

        return countA==countB;
    }
}