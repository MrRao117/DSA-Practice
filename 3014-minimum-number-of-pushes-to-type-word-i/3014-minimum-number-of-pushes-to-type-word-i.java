class Solution {
    public int minimumPushes(String word) {
        int reqPushes = 0;
        for (int i = 0; i < word.length(); i++) {

            if(i<8){
                reqPushes+=1;
            }

            else if(i<16){
                reqPushes+=2;
            }

            else if(i<24){
                reqPushes+=3;
            }

            else{
                reqPushes+=4;
            }
        }

        return reqPushes;
    }
}