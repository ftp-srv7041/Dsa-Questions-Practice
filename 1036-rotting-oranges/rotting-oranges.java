class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        int freshcount=0;
        //rotten oranges queue me dalo
        // fresh oranges count karo
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    freshcount++;
                }
            }
        } 
        int time=0;
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
        while(!q.isEmpty()&&freshcount>0){
            int size=q.size();
            time++;
            while(size-->0){
                int[] curr=q.poll();
                int r=curr[0];
                int c=curr[1];
                for(int k=0;k<4;k++){
                    int nr=r+dx[k];
                    int nc=c+dy[k];
                    if(nr>=0 && nr<n && nc>=0 && nc<m &&
                    grid[nr][nc]==1){
                        // matalb kharab bana do
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        freshcount--;
                    }
                }
            }
        }
        if(freshcount==0){
            return time;
        }
        return -1;
    }
}