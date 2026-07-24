import java.util.*;

class NetworkConnectivity {

    private List<List<Integer>> graph;
    private boolean[] visited;

    public NetworkConnectivity(int n) {
        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        visited = new boolean[n];
    }

    public void addConnection(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    private void dfs(int node) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    public int countConnectedComponents(int n) {
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(i);
            }
        }

        return components;
    }

    public static void main(String[] args) {

        int n = 7;

        NetworkConnectivity network = new NetworkConnectivity(n);

        network.addConnection(0, 1);
        network.addConnection(1, 2);

        network.addConnection(3, 4);

        network.addConnection(5, 6);

        int components = network.countConnectedComponents(n);

        System.out.println("Connected Components: " + components);

        if (components == 1) {
            System.out.println("Network is Fully Connected");
        } else {
            System.out.println("Network is NOT Fully Connected");
        }
    }
}