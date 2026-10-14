class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        // int[] target = new int[nums.length];
        // boolean[] visited = new boolean[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     if(visited[index[i]]==false){
        //         target[index[i]]=nums[i]; 
        //         visited[index[i]]=true;
        //     }
        //     else{
        //         // move every element by one position right
        //         int j=target.length-1;
        //         while(j>index[i]){
        //             target[j]=target[j-1];
        //             j--;
        //         }
        //         target[index[i]]=nums[i];
        //         visited[j+1]=true;
        //     }
        // }

        // return target;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            list.add(index[i], nums[i]);
        }

        int[] target = new int[nums.length];
        for(int i=0; i<target.length; i++){
            target[i] = list.get(i);
        }
        return target;
    }

}