package Arrays.Level2;
import java.util.*;
public class ZaraBonusCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] salaries=new double[10];
        double[] yearsOfService=new double[10];
        double[] bonuses=new double[10];
        double[] newSalaries=new double[10];
        double totalBonus=0.0;
        double totalOldSalary=0.0;
        double totalNewSalary=0.0;

        for (int i=0;i<salaries.length;i++){
            System.out.print("Enter salary of employee "+(i+1)+": ");
            salaries[i]=sc.nextDouble();
            System.out.print("Enter years of service of employee "+(i+1)+": ");
            yearsOfService[i]=sc.nextDouble();

            if (salaries[i]<0 || yearsOfService[i]<0){
                System.out.println("Invalid input. Please enter again.");
                i--; // Decrement index to repeat the input for the same employee
            }
        }

        for (int i=0;i<salaries.length;i++){
            if (yearsOfService[i]>5){
                bonuses[i]=salaries[i]*0.05;
            } else {
                bonuses[i]=salaries[i]*0.02;
            }
            newSalaries[i]=salaries[i]+bonuses[i];
            totalBonus+=bonuses[i];
            totalOldSalary+=salaries[i];
            totalNewSalary+=newSalaries[i];
        }

        System.out.println("Total bonus payout: "+totalBonus);
        System.out.println("Total old salary: "+totalOldSalary);
        System.out.println("Total new salary: "+totalNewSalary);

        sc.close();
    }
}
