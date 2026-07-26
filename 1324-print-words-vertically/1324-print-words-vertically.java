class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        List<String> ans = new ArrayList<>();

        int maxLength=0;
        for (String word : words) {
            maxLength = Math.max(maxLength, word.length());
        }

        for (int i = 0; i < maxLength; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < words.length; j++) {
                String s1 = words[j];
                if(i<s1.length()) sb.append(s1.charAt(i));
                else sb.append(' ');
            }

            ans.add(sb.toString().stripTrailing());
        }

        return ans;
    }
}