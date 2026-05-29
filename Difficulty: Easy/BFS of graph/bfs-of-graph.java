class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        boolean[] vis=new boolean[adj.size()];
        Queue<Integer>q=new LinkedList<>();
        // start mein 0 push krege
        q.offer(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            res.add(node);
            for(int i=0;i<adj.get(node).size();i++){
                int nbr=adj.get(node).get(i);
                if(!vis[nbr]){
                    vis[nbr]=true;
                    q.offer(nbr);
                }
            }
        }
        return res;
    }
}