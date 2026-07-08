import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {

        if(stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }

        return stack.remove(stack.size() - 1);
    }

    public void display() {
        System.out.println(stack);
    }
}