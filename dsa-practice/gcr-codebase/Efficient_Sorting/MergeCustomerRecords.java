import java.util.Scanner;

public class MergeCustomerRecords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] branchA = new int[n];

        for (int i = 0; i < n; i++) {
            branchA[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] branchB = new int[m];

        for (int i = 0; i < m; i++) {
            branchB[i] = sc.nextInt();
        }

        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (branchA[i] <= branchB[j]) {
                merged[k++] = branchA[i++];
            } else {
                merged[k++] = branchB[j++];
            }
        }

        while (i < n) {
            merged[k++] = branchA[i++];
        }

        while (j < m) {
            merged[k++] = branchB[j++];
        }

        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x] + " ");
        }
    }
}