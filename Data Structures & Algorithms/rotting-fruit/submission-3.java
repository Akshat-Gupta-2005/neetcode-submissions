class T{
    int x;
    int y;
    int t;

    T(int x , int y , int t){
        this.x = x;
        this.y = y;
        this.t = t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean [][]vis = new boolean[n][m];
        Queue<T> q = new LinkedList<>();
        
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if (!vis[i][j] && grid[i][j] == 2){
                    q.add(new T(i,j,0));
                    vis[i][j] = true;
                }
            }
        }

        int time = 0;

        while(!q.isEmpty()){
            T tr = q.poll();
            int x = tr.x;
            int y = tr.y;
            int t = tr.t;
            grid[x][y] = 2;
            time = Math.max(time, t);

            int []dx ={1 , 0 , -1 , 0}; 
            int []dy ={0 , -1 , 0 , 1}; 

            for (int i = 0 ; i < 4 ; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx <n && ny < m && !vis[nx][ny] && grid[nx][ny] == 1){
                    q.add(new T(nx,ny,t+1));
                    vis[nx][ny] = true;
                }
            }
        }

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if (grid[i][j] == 1) return -1;
            }
        }

        return time;
    }
}
