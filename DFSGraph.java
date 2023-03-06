// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(0,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,2);
        g.addEdge(2,4);
        g.addEdge(4,2);
        g.addEdge(3,5);
        g.addEdge(5,3);
        g.addEdge(3,6);
        g.addEdge(6,3);
        g.addEdge(3,7);
        g.addEdge(7,3);
        g.addEdge(4,7);
        g.addEdge(7,4);
        g.addEdge(4,8);
        g.addEdge(8,4);
        g.addEdge(6,8);
        g.addEdge(8,6);
        g.DFS(0);
    }
    
    public static class Graph {
    
        private int V;
        private List<Integer> adjList[];

        Graph(int v) {
            this.V = v;
            adjList = new ArrayList[v];
            for (int i = 0; i < v; i++) {
                adjList[i] = new ArrayList<>();
            }
        }

        void addEdge(int s, int d) {
            adjList[s].add(d);
        }

        void DFS(int source) {
            boolean visited[] = new boolean[V];
            DFSUtil(source, visited);
        }

        void DFSUtil(int i, boolean[] visited) {
            visited[i] = true;
            System.out.println("Node visited: " + i);
            List<Integer> adjNodes = adjList[i];
            for (int j: adjNodes) {
                if (!visited[j]) {
                    DFSUtil(j, visited);
                }
            }
        }

    }
}

