import java.util.*;

class FriendshipGraph {
    private Map<Integer, HashSet<Integer>> graph;

    public FriendshipGraph() {
        graph = new HashMap<>();
    }

    public void addFriendship(int u, int v) {
        graph.putIfAbsent(u, new HashSet<>());
        graph.putIfAbsent(v, new HashSet<>());

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public boolean isFriend(int u, int v) {
        if (!graph.containsKey(u)) {
            return false;
        }
        return graph.get(u).contains(v);
    }

    public void printGraph() {
        for (int user : graph.keySet()) {
            System.out.println(user + " -> " + graph.get(user));
        }
    }

    public static void main(String[] args) {
        FriendshipGraph g = new FriendshipGraph();

        g.addFriendship(1, 2);
        g.addFriendship(1, 3);
        g.addFriendship(2, 4);
        g.addFriendship(3, 5);

        g.printGraph();

        System.out.println(g.isFriend(1, 2));
        System.out.println(g.isFriend(2, 5));
    }
}