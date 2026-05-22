class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>max){
                max=candies[i];
            }
        }
        ArrayList<Boolean> list=new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int temp=candies[i];
            temp+=extraCandies;
            if(temp>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}