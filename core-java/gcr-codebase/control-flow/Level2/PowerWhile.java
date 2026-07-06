import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        if (power >= 0) {

            int result = 1;
            int counter = 0;

            while (counter < power) {
                result = result * number;
                counter++;
            }

            System.out.println("Result is: " + result);

        } else {
            System.out.println("Power should be a non-negative number.");
        }

        sc.close();
    }
}