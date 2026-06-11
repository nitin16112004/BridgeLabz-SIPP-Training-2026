package Arrays.Level1;
import java.util.*;

public class DynamicSentinelAggregator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] numbers=new double[10];
        double total=0.0;
        int index=0;

        while (true){
            System.out.print("Enter a number (0 or negative to stop): ");
            double num=sc.nextDouble();

            if (num<=0 || index>=numbers.length){
                break;
            }

            numbers[index]=num;
            index++;
        }

        for (int i=0;i<index;i++){
            total+=numbers[i];
        }

        System.out.println("You entered "+index+" numbers. The total is: "+total);

        sc.close();
    }
}
