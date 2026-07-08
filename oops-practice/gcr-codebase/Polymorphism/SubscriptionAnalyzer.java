// Superclass
class Subscription {
    String subscriberName;
    String subscriptionId;

    Subscription(String subscriberName, String subscriptionId) {
        this.subscriberName = subscriberName;
        this.subscriptionId = subscriptionId;
    }

    double calculateMonthlyCharge() {
        return 0;
    }

    void displayDetails() {
        System.out.println("Subscriber Name : " + subscriberName);
        System.out.println("Subscription ID : " + subscriptionId);
    }
}

// Basic Plan
class BasicPlan extends Subscription {

    BasicPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 199;
    }
}

// Premium Plan
class PremiumPlan extends Subscription {

    PremiumPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 499;
    }
}

// Family Plan
class FamilyPlan extends Subscription {

    FamilyPlan(String subscriberName, String subscriptionId) {
        super(subscriberName, subscriptionId);
    }

    @Override
    double calculateMonthlyCharge() {
        return 799;
    }
}

public class SubscriptionAnalyzer {

    // Search by Subscription ID
    static void searchById(Subscription[] subscriptions, String id) {
        boolean found = false;

        for (Subscription s : subscriptions) {
            if (s.subscriptionId.equals(id)) {
                System.out.println("\nSubscription Found:");
                s.displayDetails();
                System.out.println("Monthly Charge: ₹" +
                        s.calculateMonthlyCharge());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nSubscription ID not found.");
        }
    }

    // Display Subscribers Starting with Given Letter
    static void displaySubscribersByLetter(
            Subscription[] subscriptions, char letter) {

        System.out.println(
                "\nSubscribers whose names start with '" + letter + "':");

        boolean found = false;

        for (Subscription s : subscriptions) {
            if (Character.toUpperCase(s.subscriberName.charAt(0))
                    == Character.toUpperCase(letter)) {

                s.displayDetails();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No subscribers found.");
        }
    }

    // Calculate Total Monthly Revenue
    static double calculateTotalRevenue(
            Subscription[] subscriptions) {

        double total = 0;

        for (Subscription s : subscriptions) {
            total += s.calculateMonthlyCharge(); // Polymorphism
        }

        return total;
    }

    // Most Expensive Subscription
    static void displayMostExpensiveSubscription(
            Subscription[] subscriptions) {

        Subscription expensive = subscriptions[0];

        for (Subscription s : subscriptions) {
            if (s.calculateMonthlyCharge() >
                    expensive.calculateMonthlyCharge()) {

                expensive = s;
            }
        }

        System.out.println("\n=== Most Expensive Subscription ===");
        expensive.displayDetails();
        System.out.println("Monthly Charge : ₹" +
                expensive.calculateMonthlyCharge());
    }
}

    