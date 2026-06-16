package Recursion;
import java.util.*;
public class StringRecursiveInverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=sc.nextLine();
        String reversed=reverseString(input);
        System.out.println("Reversed string: "+reversed);
        sc.close();
    }
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
    }
}
