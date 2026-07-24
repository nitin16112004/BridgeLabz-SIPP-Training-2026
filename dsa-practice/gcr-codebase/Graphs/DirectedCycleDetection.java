import java.util.*;

class DirectedCycleDetection {

    private List<List<Integer>> graph;
    private int[] state;

    public DirectedCycleDetection(int n) {
        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        state = new int[n];
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
    }

    private boolean dfs(int node) {

        state[node] = 1;

        for (int neighbor : graph.get(node)) {

            if (state[neighbor] == 1) {
                return true;
            }

            if (state[neighbor] == 0) {
                if (dfs(neighbor)) {
                    return true;
                }
            }
        }

        state[node] = 2;

        return false;
    }

    public boolean hasCycle(int n) {

        for (int i = 0; i < n; i++) {
            if (state[i] == 0) {
                if (dfs(i)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 4;

        DirectedCycleDetection graph = new DirectedCycleDetection(n);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        if (graph.hasCycle(n)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}