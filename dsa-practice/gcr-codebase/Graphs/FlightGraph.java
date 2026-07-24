import java.util.*;

class FlightGraph {
    private Map<String, List<String>> graph;

    public FlightGraph() {
        graph = new HashMap<>();
    }

    public void addFlight(String from, String to) {
        graph.putIfAbsent(from, new ArrayList<>());
        graph.putIfAbsent(to, new ArrayList<>());

        graph.get(from).add(to);
        graph.get(to).add(from);
    }

    public List<String> shortestPath(String source, String destination) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();

        queue.offer(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if (current.equals(destination)) {
                break;
            }

            for (String neighbor : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    queue.offer(neighbor);
                }
            }
        }

        if (!visited.contains(destination)) {
            return new ArrayList<>();
        }

        List<String> path = new ArrayList<>();
        String city = destination;

        while (city != null) {
            path.add(city);
            city = parent.get(city);
        }

        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        FlightGraph g = new FlightGraph();

        g.addFlight("Delhi", "Mumbai");
        g.addFlight("Delhi", "Jaipur");
        g.addFlight("Mumbai", "Bangalore");
        g.addFlight("Jaipur", "Ahmedabad");
        g.addFlight("Ahmedabad", "Bangalore");
        g.addFlight("Bangalore", "Chennai");

        List<String> path = g.shortestPath("Delhi", "Chennai");

        if (path.isEmpty()) {
            System.out.println("No path exists.");
        } else {
            System.out.println("Shortest Path: " + path);
            System.out.println("Flights Required: " + (path.size() - 1));
        }
    }
}