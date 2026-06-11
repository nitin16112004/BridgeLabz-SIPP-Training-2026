package Arrays.Level2;
import java.util.*;
public class FiniteDigitExtractor {
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

        int largest=0;
        int secondLargest=0;

        for (int i=0;i<index;i++){
            if (digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            } else if (digits[i]>secondLargest && digits[i]!=largest){
                secondLargest=digits[i];
            }
        }

        System.out.println("Largest digit: "+largest);
        System.out.println("Second largest digit: "+secondLargest);

        sc.close();
    }
}
