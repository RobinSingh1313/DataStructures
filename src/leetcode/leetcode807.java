package leetcode;

public class leetcode807 {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        // each block contains a single building shaped like a vertical square prism

        // The skyline from each cardinal direction north, east, south, and west may be different.
        if(grid == null)
            return 0;
        int n = grid.length;
        int m = grid[0].length;
        int maxrow[] = new int[n];
        int maxcol[] = new int[m];
        for(int i = 0; i < n; i++)
            for(int j = 0 ; j < m; j++){
                maxrow[i] = Math.max(maxrow[i], grid[i][j]);
                maxcol[j] = Math.max(maxcol[j], grid[i][j]);
            }
        int count = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0 ; j < m; j++)
                count += (Math.min(maxrow[i], maxcol[j]) - grid[i][j]);

        return count;

    }

    public static void main(String[] args) {
      int[][]  grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
      int count=maxIncreaseKeepingSkyline(grid);
        System.out.println(count);

    }
}
