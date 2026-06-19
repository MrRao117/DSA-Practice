class Solution {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        int i=0;
        while(i<command.length()) {
            char ch = command.charAt(i);
            if(ch == '('){
                if(command.charAt(i+1)==')'){
                    res.append("o");
                    i=i+2;
                }
                else{
                    res.append("al");
                    i=i+4;
                }
            }
            else{
                res.append("G");
                i++;
            }
        }
       return res.toString();
    }
}