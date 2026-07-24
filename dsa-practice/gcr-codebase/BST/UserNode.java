class UserNode {
    int usernameKey;
    UserNode left;
    UserNode right;

    UserNode(int usernameKey) {
        this.usernameKey = usernameKey;
    }
}

public class Main {

    public static boolean searchUsername(UserNode root, int target) {

        UserNode current = root;

        while (current != null) {

            if (current.usernameKey == target) {
                return true;
            }

            else if (target < current.usernameKey) {
                current = current.left;
            }

            else {
                current = current.right;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Creating BST
        UserNode root = new UserNode(50);
        root.left = new UserNode(30);
        root.right = new UserNode(70);
        root.left.left = new UserNode(20);
        root.left.right = new UserNode(40);
        root.right.left = new UserNode(60);
        root.right.right = new UserNode(80);

        int target = 60;

        boolean found = searchUsername(root, target);

        System.out.println("Username Exists: " + found);
    }
}