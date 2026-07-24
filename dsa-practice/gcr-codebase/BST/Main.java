import java.util.*;

class LatencyNode {
    int value;
    LatencyNode left;
    LatencyNode right;

    LatencyNode(int value) {
        this.value = value;
    }
}

public class Main {

    public static int kthSmallest(LatencyNode root, int k) {

        Stack<LatencyNode> stack = new Stack<>();
        LatencyNode current = root;

        int count = 0;

        while (current != null || !stack.isEmpty()) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            
            current = stack.pop();
            count++;

            if (count == k) {
                return current.value;
            }

           
            current = current.right;
        }

        return -1; 
    }

    public static void main(String[] args) {

        LatencyNode root = new LatencyNode(50);
        root.left = new LatencyNode(30);
        root.right = new LatencyNode(70);
        root.left.left = new LatencyNode(20);
        root.left.right = new LatencyNode(40);
        root.right.left = new LatencyNode(60);
        root.right.right = new LatencyNode(80);

        int k = 3;

        System.out.println("Kth Smallest Value: " + kthSmallest(root, k));
    }
}