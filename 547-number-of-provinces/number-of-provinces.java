class Solution {
    public int findCircleNum(int[][] isConnected) {
    int n=isConnected.length;
    boolean[] vis=new boolean[n];
    int count=0;
    for(int i=0;i<n;i++){
        if(!vis[i]){
            dfs(isConnected,i,vis);
            count++;
        }
    } 
    return count;   
    }
    public void dfs(int[][] isConnected,int city,boolean[] vis){
        vis[city]=true;
        for(int nbr=0;nbr<isConnected.length;nbr++){
            if(isConnected[city][nbr]==1 && !vis[nbr]){
                dfs(isConnected,nbr,vis);
            }
        }
    }
}