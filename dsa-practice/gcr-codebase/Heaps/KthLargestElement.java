import java.util.PriorityQueue;

public class KthLargestElement {

    public static int findKthLargest(int[] scores, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int score : scores) {

            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] scores = {50, 80, 90, 70, 60, 85, 95};
        int k = 3;

        System.out.println("The " + k + "-th largest score is: " + findKthLargest(scores, k));
    }
}