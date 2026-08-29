class Solution {
    public int splitNum(int num) {
        int temp=num;

        int count=0;
        while(num>0){
            int r = num%10;
            count++;
            num=num/10;
        }

        num=temp;
        int[] arr = new int[count];
        int k=0;
        while(num>0){
            int r = num%10;
            arr[k]=r;
            k++;
            num=num/10;
        }

        Arrays.sort(arr);
        int num1=0, num2=0;
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                num1 = num1*10+arr[i];
            }

            else{
                num2 = num2*10+arr[i];
            }
        }

        return num1+num2;
    }
}