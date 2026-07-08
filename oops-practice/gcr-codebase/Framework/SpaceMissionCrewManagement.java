import java.util.*;


class Astronaut {
    String astronautId;
    String name;
    String specialization;

    Astronaut(String astronautId, String name, String specialization) {
        this.astronautId = astronautId;
        this.name = name;
        this.specialization = specialization;
    }

    public String toString() {
        return "ID: " + astronautId +
               ", Name: " + name +
               ", Specialization: " + specialization;
    }
}

public class SpaceMissionCrewManagement {

    static HashMap<String, List<Astronaut>> missionMap = new HashMap<>();

    static HashMap<String, HashSet<String>> missionSet = new HashMap<>();

    public static void addMission(String missionName) {

        if (missionMap.containsKey(missionName)) {
            System.out.println("Mission already exists.");
        } else {
            missionMap.put(missionName, new ArrayList<>());
            missionSet.put(missionName, new HashSet<>());
            System.out.println(missionName + " added successfully.");
        }
    }


    public static void assignAstronaut(String missionName, Astronaut astronaut) {

        if (!missionMap.containsKey(missionName)) {
            System.out.println("Mission not found.");
            return;
        }

        HashSet<String> assignedIds = missionSet.get(missionName);

        if (assignedIds.contains(astronaut.astronautId)) {
            System.out.println("Astronaut already assigned to " + missionName);
        } else {
            missionMap.get(missionName).add(astronaut);
            assignedIds.add(astronaut.astronautId);
            System.out.println(astronaut.name + " assigned to " + missionName);
        }
    }

    public static void displayMissions() {

        System.out.println("\nMission Details:");

        for (String mission : missionMap.keySet()) {

            List<Astronaut> crew = missionMap.get(mission);

            System.out.println("\nMission: " + mission);

            for (Astronaut a : crew) {
                System.out.println(a);
            }

            System.out.println("Total Astronauts: " + crew.size());
        }
    }

    public static void main(String[] args) {

        addMission("Moon Mission");
        addMission("Mars Mission");

        Astronaut a1 = new Astronaut("A101", "Rahul", "Pilot");
        Astronaut a2 = new Astronaut("A102", "Priya", "Scientist");
        Astronaut a3 = new Astronaut("A103", "Amit", "Engineer");

        assignAstronaut("Moon Mission", a1);
        assignAstronaut("Moon Mission", a2);
        assignAstronaut("Mars Mission", a2); 
        assignAstronaut("Mars Mission", a3);

    
        assignAstronaut("Moon Mission", a1);

        displayMissions();
    }
}