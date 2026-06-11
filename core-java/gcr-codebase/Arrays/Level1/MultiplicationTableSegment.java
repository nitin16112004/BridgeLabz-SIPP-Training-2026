package Arrays.Level1;
import java.util.*;
public class MultiplicationTableSegment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table from 6 to 9: ");
        int number=sc.nextInt();
        int[] multiplicationResult=new int[4];

        for (int i=0;i<multiplicationResult.length;i++){
            multiplicationResult[i]=number*(i+6);
        }

        System.out.println("Multiplication Table of "+number+" from 6 to 9:");
        for (int i=0;i<multiplicationResult.length;i++){
            System.out.println(number+" * "+(i+6)+" = "+multiplicationResult[i]);
        }

        sc.close();
    }
}
