class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        dfs(adj, 0, res, vis);
        return res;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,
                    int node,
                    ArrayList<Integer> res,
                    boolean[] vis) {
        res.add(node);
        vis[node] = true;
        for(int i = 0; i < adj.get(node).size(); i++) {
            int nbr = adj.get(node).get(i);
            if(!vis[nbr]) {
                dfs(adj, nbr, res, vis);
            }
        }
    }
}