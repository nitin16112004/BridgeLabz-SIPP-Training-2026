import java.util.*;

public class EmployeeAttendanceRanking {

    static class Employee {
        int id;
        int attendance;

        Employee(int id, int attendance) {
            this.id = id;
            this.attendance = attendance;
        }
    }

    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {

        int n = employeeIds.length;
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee(employeeIds[i], attendance[i]);
        }

        Arrays.sort(employees, (a, b) -> {
            if (a.attendance != b.attendance)
                return b.attendance - a.attendance;   
            return a.id - b.id;                       
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = employees[i].id;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};
        int k = 3;

        int[] ans = topKEmployees(employeeIds, attendance, k);

        System.out.println(Arrays.toString(ans));
    }
}