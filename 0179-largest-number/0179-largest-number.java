class Solution {
    public String largestNumber(int[] nums) {
        String[] temp = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(temp,(a,b)-> (b+a).compareTo(a+b));

        if(temp[0].equals("0")){
                return "0";
        }
        StringBuilder ans = new StringBuilder();
        for (String s : temp) {
            ans.append(s);

        }

        return ans.toString();
    }
}