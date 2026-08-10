class Solution {
    public void dfs(char[][] board , int i , int j , int n , int m , boolean[][]vis){
        if (i< 0 || i >=n || j < 0 || j>= m) return;
        if (vis[i][j] == true || board[i][j] == 'X') return;
        vis[i][j] = true;
        dfs(board,i+1,j,n,m,vis);
        dfs(board,i,j+1,n,m,vis);
        dfs(board,i-1,j,n,m,vis);
        dfs(board,i,j-1,n,m,vis);
        
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m];

        for (int i = 0 ; i < n ; i++){
            if (!vis[i][0] && board[i][0] == 'O'){
                dfs(board,i,0,n,m,vis);
            }
            if (!vis[i][m-1] && board[i][m-1] == 'O'){
                dfs(board,i,m-1,n,m,vis);
            }
        }

        for (int j = 0 ; j < m ; j++){
            if (!vis[0][j] && board[0][j] == 'O'){
                dfs(board,0,j,n,m,vis);
            }
            if (!vis[n-1][j] && board[n-1][j] == 'O'){
                dfs(board,n-1,j,n,m,vis);
            }
        }


        for (int i = 1 ; i < n-1 ; i++){
            for (int j = 1 ; j < m -1; j ++){
                if (!vis[i][j] && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

    }
}
