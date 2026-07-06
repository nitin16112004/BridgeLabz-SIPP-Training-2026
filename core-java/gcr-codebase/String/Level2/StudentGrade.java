import java.util.Scanner;
import java.util.Random;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\t%\tGrade");

        for (int i = 1; i <= n; i++) {

            int phy = random.nextInt(100);
            int chem = random.nextInt(100);
            int math = random.nextInt(100);

            int total = phy + chem + math;
            double percentage = (total / 300.0) * 100;

            String grade;

            if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else if (percentage >= 40)
                grade = "E";
            else
                grade = "R";

            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%s%n",
                    i, phy, chem, math, total, percentage, grade);
        }

        sc.close();
    }
}