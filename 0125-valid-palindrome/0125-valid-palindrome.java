class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String alphabet = "abcdefghijjklmnopqrstuvwxyz1234567890";
        String temp = s.toLowerCase();
        for (int i = 0; i < temp.length(); i++) {
            int ascii = temp.charAt(i);
            if((ascii>47 && ascii<58) || (ascii>96 && ascii<123)){
                sb.append(temp.charAt(i));
            }
        }

        int h=0, e=sb.length()-1;
        while(h<=e){
            if(sb.charAt(h)==sb.charAt(e)){
                h++;
                e--;
            }

            else{
                return false;
            }
        }

        return true;
    }
}