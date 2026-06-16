package Recursion;
import java.util.*;
public class DescendingSequencePrinter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N=sc.nextInt();
        System.out.println("Descending sequence from " + N + " to 1:");
        printDescending(N);
        sc.close();
    }
    public static void printDescending(int N) {
        if (N<1) {
            return;
        }
        System.out.print(N+" ");
        printDescending(N-1);
    }
}
