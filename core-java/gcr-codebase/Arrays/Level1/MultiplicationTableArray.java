// Create a program to print a multiplication table of a number.
// Hint => 
// Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
// Run a loop from 1 to 10 and store the results in the multiplication table array
// Finally, display the result from the array in the format number * i = ___

package Arrays.Level1;
import java.util.*;
public class MultiplicationTableArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int number=sc.nextInt();
        int[] multiplicationTable=new int[10];

        for (int i=0;i<multiplicationTable.length;i++){
            multiplicationTable[i]=number*(i+1);
        }

        System.out.println("Multiplication Table of "+number+":");
        for (int i=0;i<multiplicationTable.length;i++){
            System.out.println(number+" * "+(i+1)+" = "+multiplicationTable[i]);
        }

        sc.close();
    }
}
