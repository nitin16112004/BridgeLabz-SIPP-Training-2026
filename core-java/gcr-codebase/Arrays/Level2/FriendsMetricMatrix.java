package Arrays.Level2;
import java.util.*;
public class FriendsMetricMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] friends={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        double[] heights=new double[3];

        for (int i=0;i<friends.length;i++){
            System.out.print("Enter age of "+friends[i]+": ");
            ages[i]=sc.nextInt();
            System.out.print("Enter height of "+friends[i]+" in cm: ");
            heights[i]=sc.nextDouble();
        }

        int youngestIndex=0;
        int tallestIndex=0;

        for (int i=1;i<friends.length;i++){
            if (ages[i]<ages[youngestIndex]){
                youngestIndex=i;
            }
            if (heights[i]>heights[tallestIndex]){
                tallestIndex=i;
            }
        }

        System.out.println("The youngest friend is "+friends[youngestIndex]+" with age "+ages[youngestIndex]);
        System.out.println("The tallest friend is "+friends[tallestIndex]+" with height "+heights[tallestIndex]+" cm");

        sc.close();
    }
}
