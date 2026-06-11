package Scenario-Based;
import java.util.*;
public class SmartParkingLotSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int capacity=10, occupied=0;
        String choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Park");
            System.out.println("2. Exit");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice=sc.next();

            switch (choice) {
                case "1":
                    if (occupied<capacity) {
                        occupied++;
                        System.out.println("Car parked. Occupied: "+occupied);
                    } else {
                        System.out.println("Parking lot full.");
                    }
                    break;
                case "2":
                    if (occupied>0) {
                        occupied--;
                        System.out.println("Car exited. Occupied: "+occupied);
                    } else {
                        System.out.println("Parking lot empty.");
                    }
                    break;
                case "3":
                    System.out.println("Current occupancy: "+occupied+"/"+capacity);
                    break;
                case "4":
                    System.out.println("Exiting system.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (!choice.equals("4"));

        sc.close();
    }
}
