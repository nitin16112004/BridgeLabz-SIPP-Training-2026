import java.util.PriorityQueue;

public class KLargestElements {

    public static void findKLargest(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {

            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }

        System.out.println("K Largest Elements:");

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }

    public static void main(String[] args) {

        int[] transactions = {12, 5, 787, 1, 23, 89, 456, 1000, 65};
        int k = 4;

        findKLargest(transactions, k);
    }
}
