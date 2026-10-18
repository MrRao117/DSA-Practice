class Solution {
    public String truncateSentence(String s, int k) {
        if(k>s.length()) return s;

        String[] arr = s.split("\\s+");
        int limit = Math.min(k, arr.length);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<limit; i++){
            sb.append(arr[i]);
            if(i<limit-1) sb.append(" ");
        }

        return sb.toString();
    }   
}