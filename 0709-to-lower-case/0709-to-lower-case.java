class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            if(ascii>64 && ascii<91){
                ascii = ascii+32;
                sb.append((char)ascii);
            }

            else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}