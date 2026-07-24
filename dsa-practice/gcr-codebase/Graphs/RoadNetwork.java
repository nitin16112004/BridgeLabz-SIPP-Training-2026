import java.util.*;

class RoadNetwork {
    private Map<String, List<String>> graph;

    public RoadNetwork() {
        graph = new HashMap<>();
    }

    public void addRoad(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void findAllPaths(String source, String destination) {
        Set<String> visited = new HashSet<>();
        List<String> path = new ArrayList<>();

        dfs(source, destination, visited, path);
    }

    private void dfs(String current, String destination,
                     Set<String> visited, List<String> path) {

        visited.add(current);
        path.add(current);

        if (current.equals(destination)) {
            System.out.println(path);
        } else {
            for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    dfs(neighbor, destination, visited, path);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {
        RoadNetwork g = new RoadNetwork();

        g.addRoad("A", "B");
        g.addRoad("A", "C");
        g.addRoad("B", "D");
        g.addRoad("C", "D");
        g.addRoad("B", "E");
        g.addRoad("E", "D");

        System.out.println("All Paths from A to D:");
        g.findAllPaths("A", "D");
    }
}