package Arrays.Level2;
import java.util.*;
public class IntegerInversionProcessor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        int maxDigit=10;
        int[] digits=new int[maxDigit];
        int index=0;

        while (number!=0){
            if (index>=maxDigit){
                System.out.println("Maximum digit limit reached. Remaining digits will not be stored.");
                break;
            }
            digits[index]=number%10; // Extract the last digit
            number/=10; // Remove the last digit
            index++;
        }

        System.out.println("Digits in reverse order:");
        for (int i=index-1;i>=0;i--){
            System.out.print(digits[i]+" ");
        }

        sc.close();
    }
}
