class Solution {
    public int splitNum(int num) {
        int[] count = new int[10];
        while(num>0){
            count[num%10]++;
            num/=10;
        }

        int num1=0, num2=0;
        boolean turn = true;

        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                if(turn){
                    num1=num1*10+i;
                }
                else{
                    num2=num2*10+i;
                }

                turn = !turn;
                count[i]--;
            }
        }

        return num1+num2;
    }
}