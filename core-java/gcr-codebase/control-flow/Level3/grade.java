import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Physics Marks: ");
        int p = sc.nextInt();

        System.out.print("Chemistry Marks: ");
        int c = sc.nextInt();

        System.out.print("Maths Marks: ");
        int m = sc.nextInt();

        double avg = (p + c + m) / 3.0;

        System.out.println("Average Marks = " + avg);

        if (avg >= 80)
            System.out.println("Grade A");
        else if (avg >= 70)
            System.out.println("Grade B");
        else if (avg >= 60)
            System.out.println("Grade C");
        else if (avg >= 50)
            System.out.println("Grade D");
        else if (avg >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade R");

        sc.close();
    }
}

