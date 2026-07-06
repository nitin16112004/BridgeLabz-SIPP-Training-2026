import java.util.Scanner;
public class MultipliesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {

            int counter = 100;

            System.out.print("Multiples below 100 are: ");

            while (counter >= 1) {

                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }

                counter--;
            }

        } else {
            System.out.println("Please enter a positive number less than 100.");
        }

        sc.close();
    }
}