class PriceNode {
    int price;
    PriceNode left;
    PriceNode right;

    PriceNode(int price) {
        this.price = price;
    }
}

public class Main {

    public static boolean isValidBST(PriceNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(PriceNode root, long min, long max) {

        if (root == null) {
            return true;
        }

        if (root.price <= min || root.price >= max) {
            return false;
        }

        return validate(root.left, min, root.price) &&
               validate(root.right, root.price, max);
    }

    public static void main(String[] args) {

        PriceNode root = new PriceNode(50);
        root.left = new PriceNode(30);
        root.right = new PriceNode(70);
        root.left.left = new PriceNode(20);
        root.left.right = new PriceNode(40);
        root.right.left = new PriceNode(60);
        root.right.right = new PriceNode(80);

        System.out.println("Valid BST: " + isValidBST(root));
    }
}