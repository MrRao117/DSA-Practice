class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int index=-1;
        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i));
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }

        if(index==-1){
            return word;
        }
        sb.reverse();
        for (int i = index+1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }

        return sb.toString();
    }
}