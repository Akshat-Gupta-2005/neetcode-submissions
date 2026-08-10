class Solution {
    public void dfs(char [][] grid , int i , int j , int n , int m , boolean [][] vis){
        if (i <0 || i>=n || j < 0 || j>=m ) return;
        if (vis[i][j] == true || grid[i][j] != '1') return;
        vis[i][j] = true;
        dfs(grid,i,j+1,n,m,vis);
        dfs(grid,i+1,j,n,m,vis);
        dfs(grid,i,j-1,n,m,vis);
        dfs(grid,i-1,j,n,m,vis);
    }

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][] vis = new boolean[n][m];
        int count = 0;

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if (!vis[i][j] && grid[i][j] == '1'){
                    count ++;
                    dfs(grid,i,j,n,m,vis);

                }
            }
        }

        return count;
    }
}
