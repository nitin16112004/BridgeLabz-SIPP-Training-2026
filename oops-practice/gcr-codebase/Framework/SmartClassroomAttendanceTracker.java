import java.util.*;

public class SmartClassroomAttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {

        
        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println(student + " is already marked present in " + subject);
        } else {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        }
    }

    public static void displayAttendance() {

        if (attendance.isEmpty()) {
            System.out.println("No attendance records available.");
            return;
        }

        System.out.println("\nAttendance Report:");

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("\nSubject: " + subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students Present: " + students.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Rahul");
        markAttendance("Java", "Priya");
        markAttendance("Python", "Amit");
        markAttendance("Python", "Rahul");

        // Duplicate Attendance
        markAttendance("Java", "Rahul");

        displayAttendance();
    }
}