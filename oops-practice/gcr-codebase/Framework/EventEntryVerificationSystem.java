import java.util.*;

public class EventEntryVerificationSystem {

    static HashSet<String> participants = new HashSet<>();

    public static void registerParticipant(String email) {

        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println("Duplicate registration! " + email + " is already registered.");
        }
    }

    public static void displayParticipants() {

        if (participants.isEmpty()) {
            System.out.println("No participants registered.");
            return;
        }

        System.out.println("\nRegistered Participants:");

        for (String email : participants) {
            System.out.println(email);
        }

        System.out.println("\nTotal Eligible Attendees: " + participants.size());
    }

    public static void main(String[] args) {

        registerParticipant("rahul@gmail.com");
        registerParticipant("priya@gmail.com");
        registerParticipant("rahul@gmail.com");

        displayParticipants();
    }
}