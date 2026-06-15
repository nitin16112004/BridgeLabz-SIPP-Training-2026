package method.Level1;
import java.util.*;

public class NetworkHandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents=sc.nextInt();

        int handshakes=calculateHandshakes(numberOfStudents);
        System.out.printf("The maximum number of handshakes among %d students is: %d%n", numberOfStudents, handshakes);

        sc.close();
    }

    private static int calculateHandshakes(int n) {
        if(n<2){
            return 0;
        }
        return (n*(n-1))/2;
    }
}
