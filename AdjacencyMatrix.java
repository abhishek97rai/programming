public class AdjacencyMatrix {
    
    static class ManualGraph {
        int V;
        int[][] adjMatrix;
        
        ManualGraph(int vert) {
            this.V = vert;
            adjMatrix = new int[V][V];
        }
        
        void addEdge(int a, int b) {
            adjMatrix[a-1][b-1] = 1;
            adjMatrix[b-1][a-1] = 1;
        }
        
        void removeEdge(int a, int b) {
            adjMatrix[a-1][b-1] = 0;
            adjMatrix[b-1][a-1] = 0;
        }
        
        void print() {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        ManualGraph gr = new ManualGraph(4);
        gr.addEdge(1,3);
        gr.addEdge(1,4);
        gr.addEdge(2,3);
        gr.addEdge(2,4);
        gr.removeEdge(1,3);
        gr.print();
    }
    
}