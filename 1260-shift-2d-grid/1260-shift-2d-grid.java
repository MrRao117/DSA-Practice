class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int[][] arr = new int[grid.length][grid[0].length];
        int n= grid.length*grid[0].length;

        k=k%n;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                int curr = i* grid[0].length+j;
                int newIdx = (curr+k)%n;

                int row = newIdx/ grid[0].length;
                int col = newIdx% grid[0].length;
                arr[row][col] = grid[i][j];
            }
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < arr[0].length; j++) {
                temp.add(arr[i][j]);
            }

            list.add(temp);
        }

        return list;
    }
}