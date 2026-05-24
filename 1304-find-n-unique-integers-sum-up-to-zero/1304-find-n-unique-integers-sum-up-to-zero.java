class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int x= -n/2;
        if(n%2==0){
            for (int i = 0; i < arr.length; i++) {
                if(x!=0) {
                    arr[i] = x;
                    
                }
                else{
                    x++;
                    arr[i]=x;
                }
                x++;
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                arr[i]=x;
                x++;
            }
        }
        return arr;
    }
}