class Solution {
    public int minimumPushes(String word) {
         int[] count = new int[26];
        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i)-'a']++;
        }

        Arrays.sort(count);


        int uniqueChar = 0;
        int ans = 0;
        for (int i = count.length-1; i >=0 ; i--) {

            if(count[i]==0) break;

            int pushReq = uniqueChar/8+1;
            ans+=pushReq* count[i];
            uniqueChar++;
        }

        return ans;
    }
}