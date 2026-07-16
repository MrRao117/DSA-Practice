class Solution {
    public long gcdSum(int[] nums) {
        int max =nums[0];
        int[] prefixGcd = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            prefixGcd[i] = findGcd(max,nums[i]);
        }

        Arrays.sort(prefixGcd);

        long sum = 0;
        int s=0, e=prefixGcd.length-1;
        while(s<e){
            sum+=findGcd(prefixGcd[s], prefixGcd[e]);
            s++;
            e--;
        }

        return sum;
    }

    public static int findGcd(int a, int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}