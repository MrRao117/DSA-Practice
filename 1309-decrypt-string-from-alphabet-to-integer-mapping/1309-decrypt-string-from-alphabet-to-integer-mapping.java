class Solution {
    public String freqAlphabets(String s) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            if(s.charAt(i)=='#'){
                String temp = s.substring(i-2,i);
                int num = Integer.parseInt(temp);
                sb.append(alphabet.charAt(num-1));
                i-=3;
            }

            else{
                int num = s.charAt(i)-'0';
                sb.append(alphabet.charAt(num-1));
                i--;
            }
        }

        sb.reverse();
        return sb.toString();
    }
}