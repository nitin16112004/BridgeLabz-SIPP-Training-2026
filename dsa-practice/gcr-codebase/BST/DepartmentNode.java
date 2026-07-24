class DepartmentNode {
    int code;
    DepartmentNode left;
    DepartmentNode right;

    DepartmentNode(int code) {
        this.code = code;
    }
}

public class Main {

    public static DepartmentNode findLCA(DepartmentNode root, int a, int b) {

        while (root != null) {

            if (a < root.code && b < root.code) {
                root = root.left;
            }

            else if (a > root.code && b > root.code) {
                root = root.right;
            }

            else {
                return root;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        DepartmentNode root = new DepartmentNode(50);
        root.left = new DepartmentNode(30);
        root.right = new DepartmentNode(70);
        root.left.left = new DepartmentNode(20);
        root.left.right = new DepartmentNode(40);
        root.right.left = new DepartmentNode(60);
        root.right.right = new DepartmentNode(80);

        int dept1 = 20;
        int dept2 = 40;

        DepartmentNode lca = findLCA(root, dept1, dept2);

        System.out.println("LCA Department Code: " + lca.code);
    }
}