import java.util.*;

class Edge{
    int v;
    int wt;
    
    Edge(int v,int wt){
        this.v = v;
        this.wt = wt;
    }
}


class Main {
    
    public static void dijkstra(int src,ArrayList<ArrayList<Edge>> g,int V){
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        int[] dist = new int[V];
        
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        dist[src] = 0;
        pq.offer(new int[]{0,src});
        
        while(!pq.isEmpty()){
            
            int u = pq.peek()[1];
            pq.poll();
            
            for(Edge e : g.get(u)){
                
                if(dist[e.v] > dist[u]+e.wt){
                    dist[e.v] = dist[u]+e.wt;
                    pq.offer(new int[]{dist[e.v],e.v});
                }
            }
        }
        
        for(int i = 0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Edge>> g = new ArrayList<>();
        int V = 6;
        
        for(int i = 0;i<V;i++){
            g.add(new ArrayList<>());
        }
        
        g.get(0).add(new Edge(1, 4));
        g.get(0).add(new Edge(2, 1));

        g.get(2).add(new Edge(1, 2));
        g.get(1).add(new Edge(3, 1));

        g.get(2).add(new Edge(3, 5));
        g.get(3).add(new Edge(4, 3));

        dijkstra(0, g, V);
        
    }
}
