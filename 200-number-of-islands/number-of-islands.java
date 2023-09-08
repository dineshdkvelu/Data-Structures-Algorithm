class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res =0;
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(grid[i][j] == '1'){
                    res++;
                    check(grid, m, n , i, j);
                }
            }
        }
        return res;
    }

    public int check(char grid[][], int m, int n, int i, int j){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j] != '1') return 0;
        if(grid[i][j] == '1') grid[i][j] = '2';
        check(grid, m, n, i-1, j);
        check(grid, m, n, i+1, j);
        check(grid, m, n, i, j-1);
        check(grid, m, n, i, j+1);
        return 0;
    }
}