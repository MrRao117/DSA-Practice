class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder temp = new StringBuilder();
        int count=0;
        while(temp.length()<b.length()){
            temp.append(a);
            count++;
        }

        if(temp.indexOf(b)!=-1){
            return count;
        }

        temp.append(a);
        count++;
        if(temp.indexOf(b)!=-1){
            return count;
        }

        return -1;
    }
}