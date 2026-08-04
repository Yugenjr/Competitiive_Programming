class Solution {
    public boolean canFinish(int n, int[][] edges) {

        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];

        for(int i =0 ;i<n;i++){
            if(!vis[i]){
                if(isCycle(i,vis,path,edges)) return false;
            }
        } 

        return true;

    }

    public boolean isCycle(int src ,boolean[] vis,boolean[] path,int[][] edges){

        vis[src] = true;
        path[src] = true;

        for(int i =0;i<edges.length;i++){
            
            int v = edges[i][0];
            int u = edges[i][1];

        if (src == u) {
            if (!vis[v]) {
                if (isCycle(v, vis, path, edges)) return true;
            } else if (path[v]) {
                return true;
            }
        }

        }

        path[src] = false;
        return false; 
    }
}
