package Recursion;
import java.util.*;
public class FactorialEngine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N=sc.nextInt();
        int factorial=factorial(N);
        System.out.println("Factorial of "+N+" is: "+factorial);
        sc.close();
    }
    public static int factorial(int N) {
        if (N==0 || N==1) {
            return 1;
        }
        return N*factorial(N-1);
    }
}
