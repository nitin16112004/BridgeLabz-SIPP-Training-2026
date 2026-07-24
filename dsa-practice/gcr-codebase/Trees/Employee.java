class EmployeeNode {
    int id;
    EmployeeNode left;
    EmployeeNode right;

    EmployeeNode(int id) {
        this.id = id;
    }
}

public class Main {

    static int diameter = 0;

    public static int height(EmployeeNode root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight + 2);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static int findDiameter(EmployeeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    public static void main(String[] args) {

        EmployeeNode root = new EmployeeNode(1);
        root.left = new EmployeeNode(2);
        root.right = new EmployeeNode(3);
        root.left.left = new EmployeeNode(4);
        root.left.right = new EmployeeNode(5);
        root.left.left.left = new EmployeeNode(6);

        System.out.println("Diameter: " + findDiameter(root));
    }
}