class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=0;
        if(b.isEmpty()) return 0;
        StringBuilder temp = new StringBuilder();
        while(temp.length()<=Math.pow(10,4)){
            temp.append(a);
            count++;
            if(temp.indexOf(b)!=-1){
                return count;
            }
        }
        return -1;
    }
}