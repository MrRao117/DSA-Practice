class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String res : word1){
            sb1.append(res);
        }

        for(String res : word2){
            sb2.append(res);
        }

        return sb1.compareTo(sb2)==0;
    }
}