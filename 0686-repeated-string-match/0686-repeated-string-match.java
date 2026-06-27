class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=0;
        if(b.isEmpty()) return 0;
        String temp = "";
        while(temp.length()<=Math.pow(10,4)){
            temp = temp+a;
            count++;
            if(temp.contains(b)){
                return count;
            }
        }
        return -1;
    }
}