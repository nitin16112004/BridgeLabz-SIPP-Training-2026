import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {

            int i = 1;

            System.out.print("Factors are: ");

            while (i < number) {

                if (number % i == 0) {
                    System.out.print(i + " ");
                }

                i++;
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}