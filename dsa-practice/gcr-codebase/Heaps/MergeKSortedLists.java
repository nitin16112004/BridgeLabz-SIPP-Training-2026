import java.util.*;

class Node {
    int value;
    int listIndex;
    int elementIndex;

    Node(int value, int listIndex, int elementIndex) {
        this.value = value;
        this.listIndex = listIndex;
        this.elementIndex = elementIndex;
    }
}

public class MergeKSortedLists {

    public static List<Integer> merge(int[][] lists) {

        PriorityQueue<Node> minHeap = new PriorityQueue<>(
                (a, b) -> a.value - b.value);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            if (lists[i].length > 0) {
                minHeap.offer(new Node(lists[i][0], i, 0));
            }
        }

        while (!minHeap.isEmpty()) {

            Node current = minHeap.poll();
            result.add(current.value);

            int nextIndex = current.elementIndex + 1;

            if (nextIndex < lists[current.listIndex].length) {
                minHeap.offer(new Node(
                        lists[current.listIndex][nextIndex],
                        current.listIndex,
                        nextIndex));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] lists = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}
        };

        List<Integer> merged = merge(lists);

        System.out.println(merged);
    }
}
