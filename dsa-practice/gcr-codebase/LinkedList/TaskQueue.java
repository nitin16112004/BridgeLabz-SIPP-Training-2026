class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TaskQueue {

    public static Node removeTask(Node head, int taskId) {

        if (head == null) {
            return null;
        }

        if (head.data == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);

        System.out.println("Before Deletion:");
        printList(head);

        head = removeTask(head, 103);

        System.out.println("After Deletion:");
        printList(head);
    }
}