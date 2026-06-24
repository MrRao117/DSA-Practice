class Solution {
    public boolean isValid(String s) {
        char[] arr= new char[s.length()];
        int pointer=-1;

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if(ch=='(' || ch=='[' || ch=='{'){
                pointer++;
                arr[pointer]=ch;
            }

            else{

                if(pointer==-1){
                    return false;
                }

                char lastOpener = arr[pointer];
                pointer--;

                if(ch==')' && lastOpener!='(') return false;
                if(ch==']' && lastOpener!='[') return false;
                if(ch=='}' && lastOpener!='{') return false;

            }
        }
        return pointer==-1;
    }
}