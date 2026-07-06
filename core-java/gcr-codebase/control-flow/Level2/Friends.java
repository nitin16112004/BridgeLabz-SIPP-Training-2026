import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Enter heights of Amar, Akbar, Anthony:");
        double h1 = sc.nextDouble();
        double h2 = sc.nextDouble();
        double h3 = sc.nextDouble();

        if (a <= b && a <= c)
            System.out.println("Youngest is Amar");
        else if (b <= a && b <= c)
            System.out.println("Youngest is Akbar");
        else
            System.out.println("Youngest is Anthony");

        if (h1 >= h2 && h1 >= h3)
            System.out.println("Tallest is Amar");
        else if (h2 >= h1 && h2 >= h3)
            System.out.println("Tallest is Akbar");
        else
            System.out.println("Tallest is Anthony");

        sc.close();
    }
}