package Recursion;
import java.util.*;
public class PalindromeRecursiveVerifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        if (isPalindrome(input,0,input.length()-1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(String str, int left, int right) {
        if(left>=right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        return isPalindrome(str,left+1,right-1);
    }
}
