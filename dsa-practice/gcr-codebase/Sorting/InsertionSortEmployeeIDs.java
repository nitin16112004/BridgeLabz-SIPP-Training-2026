import java.util.Scanner;

public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empID = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            empID[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int key = empID[i];
            int j = i - 1;

            while (j >= 0 && empID[j] > key) {
                empID[j + 1] = empID[j];
                j--;
            }

            empID[j + 1] = key;
        }

        System.out.println("Employee IDs in Ascending Order:");
        for (int i = 0; i < n; i++) {
            System.out.print(empID[i] + " ");
        }

        sc.close();
    }
}