import java.util.Scanner;

public class BMIEasy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Person\tHeight\tWeight\tBMI\tStatus");

        for (int i = 1; i <= 10; i++) {

            System.out.println("\nEnter details of Person " + i);

            System.out.print("Height (cm): ");
            double height = sc.nextDouble();

            System.out.print("Weight (kg): ");
            double weight = sc.nextDouble();

            double heightMeter = height / 100;
            double bmi = weight / (heightMeter * heightMeter);

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            System.out.printf("%d\t%.0f\t%.0f\t%.2f\t%s%n",
                    i, height, weight, bmi, status);
        }

        sc.close();
    }
}