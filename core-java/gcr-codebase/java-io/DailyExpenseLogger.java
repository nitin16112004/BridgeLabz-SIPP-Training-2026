import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("expenses.txt", true));

            System.out.print("Enter number of expenses: ");
            int n = sc.nextInt();
            sc.nextLine(); 

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter category: ");
                String category = sc.nextLine();

                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                sc.nextLine(); 

                writer.write(category + " - " + amount);
                writer.newLine();
            }

            writer.close();
            System.out.println("Expenses saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }

        sc.close();
    }
}
