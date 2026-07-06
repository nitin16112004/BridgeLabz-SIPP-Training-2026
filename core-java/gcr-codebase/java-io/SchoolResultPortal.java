import java.io.*;
import java.util.*;

public class SchoolResultPortal {

    public static void main(String[] args) {

        String inputFile = "students.txt";
        String outputFile = "reportcards.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // true = append mode (prevents overwriting)
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(outputFile, true))
        ) {

            String line;

            writer.write("\n===== NEW REPORT ENTRY =====\n");

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int total = 0;

                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i]);
                }

                double average = (double) total / (data.length - 1);

                writer.write("Student Name : " + name + "\n");
                writer.write("Average Marks: " +
                             String.format("%.2f", average) + "\n");

                if (average >= 90)
                    writer.write("Grade        : A\n");
                else if (average >= 75)
                    writer.write("Grade        : B\n");
                else if (average >= 60)
                    writer.write("Grade        : C\n");
                else
                    writer.write("Grade        : D\n");

                writer.write("-----------------------------\n");
            }

            System.out.println("Report cards generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file '" + inputFile +
                               "' was not found.");
        } catch (IOException e) {
            System.out.println("File operation error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks format in file.");
        }
    }
}