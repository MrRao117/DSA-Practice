class Solution {
    public int minCostToMoveChips(int[] position) {
        int e=0, o=0, n=position.length;
        for(int i=0; i<n; i++){
            if(position[i]%2==0) e++;
            else o++;
        }
        return Math.min(e,o);
    }
}