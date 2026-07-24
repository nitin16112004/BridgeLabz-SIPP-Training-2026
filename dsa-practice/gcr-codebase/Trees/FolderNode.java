class FolderNode {
    int id;
    FolderNode left;
    FolderNode right;

    FolderNode(int id) {
        this.id = id;
    }
}

public class Main {

    public static void deleteFolder(FolderNode root) {
        if (root == null) {
            return;
        }

      
        deleteFolder(root.left);
        deleteFolder(root.right);

        System.out.print(root.id + " ");
    }

    public static void main(String[] args) {

        FolderNode root = new FolderNode(1);
        root.left = new FolderNode(2);
        root.right = new FolderNode(3);
        root.left.left = new FolderNode(4);
        root.left.right = new FolderNode(5);
        root.right.left = new FolderNode(6);
        root.right.right = new FolderNode(7);

        System.out.print("Deletion Order (Postorder): ");
        deleteFolder(root);
    }
}