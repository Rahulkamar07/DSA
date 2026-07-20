class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int r = grid.length;
        int c = grid[0].length;

        int[][] ans = new int[r][c];

        k %= (r * c);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                int index = i * c + j;
                int newIndex = (index + k) % (r * c);

                int newRow = newIndex / c;
                int newCol = newIndex % c;

                ans[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int[] row : ans) {
            List<Integer> temp = new ArrayList<>();
            for (int num : row) {
                temp.add(num);
            }
            list.add(temp);
        }

        return list;
    }
}