
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        // code here
        int n=V;
        int m=edges.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            // khali list
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int src=edges[i][0];
            int dest=edges[i][1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        return adj;
    }
}