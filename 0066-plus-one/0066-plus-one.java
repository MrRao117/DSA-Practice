class Solution {
    public int[] plusOne(int[] digits) {
       int count9=0;
        int num=0;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]==9){
                count9++;
            }
        }

        if(count9== digits.length){
            int[] result= new int[digits.length+1];
            result[0]=1;
            return result;
        }
        else{
            if(digits[digits.length-1]<9){
                digits[digits.length-1]=digits[digits.length-1]+1;
                return digits;
            }
            else {
                    digits[digits.length-1]+=1;
                for (int i = digits.length - 1; i >= 0; i--) {

                    num=digits[i]+num;
                    int rem=num%10;
                    digits[i]=rem;
                    num=num/10;
                }
                return digits;
            }
        }
    }
}