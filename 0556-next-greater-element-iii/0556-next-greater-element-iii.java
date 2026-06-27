class Solution {
    public int nextGreaterElement(int n) {
         char[] arr = String.valueOf(n).toCharArray();
       int len = arr.length;

       int i=len-2;
       while(i>=0 && arr[i]>=arr[i+1]){
           i--;
       }

       if(i<0) return -1;

       int j=len-1;
       while(arr[j]<=arr[i]){
           j--;
       }

       swap(arr,i,j);

       reverse(arr,i+1,len-1);

       long result = Long.parseLong(new String(arr));

       if(result>Integer.MAX_VALUE){
           return -1;
       }

       return (int)result;
    }

    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(char[] arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}