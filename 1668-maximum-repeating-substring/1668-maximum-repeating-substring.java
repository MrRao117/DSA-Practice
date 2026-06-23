class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
       StringBuilder repeatedWord = new StringBuilder();
       while(sequence.contains(repeatedWord)){
           count++;
           repeatedWord.append(word);
       }

       return count-1;
    }
}