class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i=num.length-1;
        int carry=0;
        while(i>=0 || k>0 || carry>0){
            int currentSum=carry;
            if(i>=0){
                currentSum+=num[i];
                i--;
            }
            if(k>0){
                currentSum+=k%10;
                k=k/10;
            }
            int numDigit=currentSum%10;
            carry=currentSum/10;

            list.add(numDigit);
        }
        Collections.reverse(list);
        return list;
    }
}