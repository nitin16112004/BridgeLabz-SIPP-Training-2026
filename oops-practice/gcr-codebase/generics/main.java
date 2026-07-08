import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        

        System.out.println("----- Pair Class -----");

        Pair<String, Integer> pair = new Pair<>("Mahi", 20);
        pair.display();


        

        System.out.println("\n----- Generic Stack -----");

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped : " + stack.pop());

        stack.display();


        

        System.out.println("\n----- findMax() -----");

        Integer[] numbers = {12, 45, 2, 90, 18};

        System.out.println("Maximum = " + Utils.findMax(numbers));


        

        System.out.println("\n----- Repository -----");

        Repository<String> repo = new Repository<>();

        repo.add("Laptop");
        repo.add("Mouse");
        repo.add("Keyboard");

        repo.display();


        

        System.out.println("\n----- Wildcard List<?> -----");

        Utils.printList(Arrays.asList(1,2,3,4,5));

        Utils.printList(Arrays.asList("Java","Python","C++"));
    }
}