class EmployeeNode {
    int id;
    EmployeeNode left;
    EmployeeNode right;

    EmployeeNode(int id) {
        this.id = id;
    }
}

public class Main {

    public static EmployeeNode insert(EmployeeNode root, int id) {

        if (root == null) {
            return new EmployeeNode(id);
        }

        if (id < root.id) {
            root.left = insert(root.left, id);
        }

        else if (id > root.id) {
            root.right = insert(root.right, id);
        }

        return root;
    }

    public static void inorder(EmployeeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.id + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        
        EmployeeNode root = new EmployeeNode(50);
        root.left = new EmployeeNode(30);
        root.right = new EmployeeNode(70);

        root = insert(root, 60);

        System.out.print("Employee IDs: ");
        inorder(root);
    }
}