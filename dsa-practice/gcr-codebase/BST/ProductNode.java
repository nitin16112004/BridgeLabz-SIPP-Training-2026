class ProductNode {
    int sku;
    ProductNode left;
    ProductNode right;

    ProductNode(int sku) {
        this.sku = sku;
    }
}

public class Main {

    public static ProductNode delete(ProductNode root, int sku) {

        if (root == null) {
            return null;
        }

        if (sku < root.sku) {
            root.left = delete(root.left, sku);
        }

        else if (sku > root.sku) {
            root.right = delete(root.right, sku);
        }

        else {

            if (root.left == null && root.right == null) {
                return null;
            }

            else if (root.left == null) {
                return root.right;
            }

            else if (root.right == null) {
                return root.left;
            }

            else {

                ProductNode successor = findMin(root.right);

                root.sku = successor.sku;

                root.right = delete(root.right, successor.sku);
            }
        }

        return root;
    }

    public static ProductNode findMin(ProductNode root) {

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void inorder(ProductNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.sku + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        ProductNode root = new ProductNode(50);
        root.left = new ProductNode(30);
        root.right = new ProductNode(70);
        root.left.left = new ProductNode(20);
        root.left.right = new ProductNode(40);
        root.right.left = new ProductNode(60);
        root.right.right = new ProductNode(80);

       
        root = delete(root, 50);

        System.out.print("Updated Catalog: ");
        inorder(root);
    }
}