import java.util.PriorityQueue;
import java.util.Collections;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class EmergencyRoom {

    PriorityQueue<Patient> queue = new PriorityQueue<>(
        (a, b) -> b.severity - a.severity
    );

    public void addPatient(String name, int severity) {
        queue.offer(new Patient(name, severity));
    }

    public Patient treatPatient() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.addPatient("Aman", 5);
        er.addPatient("Riya", 9);
        er.addPatient("Karan", 3);
        er.addPatient("Neha", 7);

        while (!er.queue.isEmpty()) {
            Patient p = er.treatPatient();
            System.out.println(p.name + " Severity: " + p.severity);
        }
    }
}
