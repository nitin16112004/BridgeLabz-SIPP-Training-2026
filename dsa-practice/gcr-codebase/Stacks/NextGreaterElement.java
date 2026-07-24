import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextBusierDay(int[] visitors) {

        int n = visitors.length;
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = -1;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && visitors[i] > visitors[stack.peek()]) {
                int index = stack.pop();
                answer[index] = visitors[i];
            }

            stack.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] visitors = {100, 80, 120, 90, 140, 110};

        int[] result = nextBusierDay(visitors);

        System.out.println("Daily Visitors:");
        for (int num : visitors) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nNext Greater Visitor Count:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}