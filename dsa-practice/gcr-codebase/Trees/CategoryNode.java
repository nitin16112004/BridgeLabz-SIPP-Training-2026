class CategoryNode {
    int id;
    CategoryNode left;
    CategoryNode right;

    CategoryNode(int id) {
        this.id = id;
    }
}

public class Main {

    public static int findHeight(CategoryNode root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean exceedsThreshold(CategoryNode root, int threshold) {
        return findHeight(root) > threshold;
    }

    public static void main(String[] args) {
        CategoryNode root = new CategoryNode(1);
        root.left = new CategoryNode(2);
        root.right = new CategoryNode(3);
        root.left.left = new CategoryNode(4);
        root.left.left.left = new CategoryNode(5);

        int threshold = 2;

        System.out.println("Tree Height: " + findHeight(root));
        System.out.println("Exceeds Threshold: " + exceedsThreshold(root, threshold));
    }
}