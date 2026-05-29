// class Solution {
//     public int numIslands(char[][] grid) {
//         int n=grid.length;
//         int m=grid[0].length;
//         boolean[][] visited=new boolean[n][m];
//         int count=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(grid[i][j]=='1'&&!visited[i][j]){
//                     dfs(grid,i,j,visited);
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public void dfs(char[][]grid,int row,int col,boolean[][] visited){
//         // invalid case
//         if(row<0||row>=grid.length||col<0||col>=grid[0].length||
//         grid[row][col]=='0'||visited[row][col]){
//             return;
//         }
//         visited[row][col]=true;
//         // up
//         dfs(grid,row-1,col,visited);
//         // down
//         dfs(grid,row+1,col,visited);
//         // left
//         dfs(grid,row,col-1,visited);
//         // right
//         dfs(grid,row,col+1,visited);
//     }
// }


class Solution {

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];

        int count = 0;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < m; j++) {

                if(grid[i][j] == '1' &&
                   !vis[i][j]) {

                    dfs(grid, i, j, vis);

                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid,
                    int row,
                    int col,
                    boolean[][] vis) {

        vis[row][col] = true;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for(int k = 0; k < 4; k++) {

            int nr = row + dx[k];
            int nc = col + dy[k];

            if(nr >= 0 &&
               nr < grid.length &&
               nc >= 0 &&
               nc < grid[0].length &&
               grid[nr][nc] == '1' &&
               !vis[nr][nc]) {

                dfs(grid, nr, nc, vis);
            }
        }
    }
}