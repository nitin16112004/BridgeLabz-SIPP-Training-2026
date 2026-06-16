package Recursion;
import java.util.*;
public class NaturalProgressionAccumulator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N=sc.nextInt();
        int sum=sumOfNaturalNumbers(N);
        System.out.println("Sum of first "+N+" natural numbers is: "+sum);
        sc.close();
    }
    private static int sumOfNaturalNumbers(int N) {
        if (N==0) {
            return 0;
        }
        return N+sumOfNaturalNumbers(N-1);
    }
}
