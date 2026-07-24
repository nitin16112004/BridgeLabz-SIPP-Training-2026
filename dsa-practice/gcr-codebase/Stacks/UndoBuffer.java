public class UndoBuffer {

    private String[] data;
    private int top;

    public UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    public boolean push(String edit) {
        if (top == data.length - 1) {
            System.out.println("Undo Buffer is Full");
            return false;
        }
        data[++top] = edit;
        return true;
    }

    public String pop() {
        if (isEmpty()) {
            return "Nothing to undo";
        }
        return data[top--];
    }

    public String peek() {
        if (isEmpty()) {
            return "Undo Buffer is Empty";
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Undo Buffer is Empty");
            return;
        }

        System.out.println("Undo Buffer:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {

        UndoBuffer buffer = new UndoBuffer(5);

        buffer.push("Typed Hello");
        buffer.push("Typed World");
        buffer.push("Deleted World");
        buffer.push("Inserted Java");
        buffer.push("Bold Text");

        buffer.display();

        System.out.println("\nLatest Edit: " + buffer.peek());

        System.out.println("\nUndo: " + buffer.pop());
        System.out.println("Undo: " + buffer.pop());

        System.out.println("\nAfter Undo:");
        buffer.display();

        System.out.println("\nTrying to add another edit:");
        buffer.push("Italic Text");

        System.out.println("\nFinal Undo Buffer:");
        buffer.display();
    }
}