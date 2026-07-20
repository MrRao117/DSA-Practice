class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] ch = s.toCharArray();
        long totalShifts = 0;

        for (int i = s.length()-1; i >=0 ; i--) {
            totalShifts+=shifts[i];

            ch[i] = (char) ((ch[i]-'a'+totalShifts)%26+'a');
        }

        return new String(ch);
    }
}