package method.Level2;
import java.util.*;

public class FactorsAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();

        int[] factors=findFactors(number);
        System.out.println("Factors of "+number+": "+Arrays.toString(factors));

        int sumOfFactors=sumOfFactors(factors);
        System.out.println("Sum of factors: "+sumOfFactors);

        int productOfFactors=productOfFactors(factors);
        System.out.println("Product of factors: "+productOfFactors);

        double sumOfSquares=sumOfSquares(factors);
        System.out.println("Sum of squares of factors: "+sumOfSquares);

        sc.close();
    }
}
