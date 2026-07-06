import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {
        int lineCount = 0;

        try {
            FileReader fr = new FileReader("bill.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            System.out.println("Contents of bill.txt:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }

            br.close();

            System.out.println("\nTotal number of lines = " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: bill.txt file not found.");
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}