class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        if(words1.length<words2.length){
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        int start=0;
        int end1= words1.length-1, end2 = words2.length-1;

        while(start<=end2 && words1[start].equals(words2[start])){
            start++;
        }

        while(end2>=start && words1[end1].equals(words2[end2])){
            end2--;
            end1--;;
        }

        return start>end2;
    }
}