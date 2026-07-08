// Superclass
class RescueTeam {
    String teamId;
    String location;

    RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    void performDuty() {
        System.out.println("Rescue Team is performing duty.");
    }

    void displayDetails() {
        System.out.println("Team ID  : " + teamId);
        System.out.println("Location : " + location);
    }
}

// Medical Team
class MedicalTeam extends RescueTeam {

    MedicalTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println(teamId +
                " is providing medical assistance.");
    }
}

// Fire Rescue Team
class FireRescueTeam extends RescueTeam {

    FireRescueTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println(teamId +
                " is rescuing people from fire hazards.");
    }
}

// Food Supply Team
class FoodSupplyTeam extends RescueTeam {

    FoodSupplyTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    void performDuty() {
        System.out.println(teamId +
                " is distributing food and water.");
    }
}

public class DisasterRescueManagement {

    // Find Team by Location
    static void findTeamByLocation(
            RescueTeam[] teams, String location) {

        boolean found = false;

        for (RescueTeam team : teams) {
            if (team.location.equalsIgnoreCase(location)) {
                team.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No team found at " + location);
        }
    }

    // Display Teams by Prefix
    static void displayTeamsByPrefix(
            RescueTeam[] teams, String prefix) {

        boolean found = false;

        for (RescueTeam team : teams) {
            if (team.teamId.startsWith(prefix)) {
                team.displayDetails();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching teams found.");
        }
    }

    // Count Teams and Display Maximum Deployment Category
    static void analyzeDeployments(RescueTeam[] teams) {

        int medicalCount = 0;
        int fireCount = 0;
        int foodCount = 0;

        for (RescueTeam team : teams) {

            if (team instanceof MedicalTeam) {
                medicalCount++;
            } else if (team instanceof FireRescueTeam) {
                fireCount++;
            } else if (team instanceof FoodSupplyTeam) {
                foodCount++;
            }
        }

        System.out.println("\n=== Deployment Count ===");
        System.out.println("Medical Teams     : " + medicalCount);
        System.out.println("Fire Rescue Teams : " + fireCount);
        System.out.println("Food Supply Teams : " + foodCount);

        int max = Math.max(medicalCount,
                  Math.max(fireCount, foodCount));

        System.out.print("Maximum Deployments Category : ");

        if (max == medicalCount) {
            System.out.println("Medical Team");
        } else if (max == fireCount) {
            System.out.println("Fire Rescue Team");
        } else {
            System.out.println("Food Supply Team");
        }
    }
}