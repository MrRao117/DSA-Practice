class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] count= new int[26];
        int uniqueLetters=0;
        int n=sentence.length();
        if(n<26){
            return false;
        }
        else {
            for (int i = 0; i < n; i++) {
                char ch=sentence.charAt(i);
                int index=ch-'a';
                if(count[index]==0){
                    uniqueLetters++;
                }
                count[index]++;
                if (uniqueLetters == 26) {
                    return true;
                }
            }

            return false;
        }
        }
    }
