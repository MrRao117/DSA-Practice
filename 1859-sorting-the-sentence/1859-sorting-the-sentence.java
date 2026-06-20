class Solution {
    public String sortSentence(String s) {
         String[] arr = s.split(" ");
        int a=0;
        while(a< arr.length){
            String curr = arr[a];
            int i = curr.length()-1;
            int k = curr.charAt(i)-48;
            if(k!=a+1){
                String temp = arr[a];
                arr[a]=arr[k-1];
                arr[k-1]=temp;

            }
            else{
                a++;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            sb.append(word.substring(0,word.length()-1));

            if(i<arr.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}