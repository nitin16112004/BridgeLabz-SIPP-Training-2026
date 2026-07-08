import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    public String toString() {
        return "Name : " + name +
               "\nPhone: " + phone +
               "\nEmail: " + email;
    }
}

public class AddressBook {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Phone number already exists!");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contacts.add(c);
        map.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact Added Successfully.\n");
    }

    public static void searchContact(String name) {

        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

   
    public static void deleteContact(String name) {

        if (!map.containsKey(name)) {
            System.out.println("Contact not found.");
            return;
        }

        Contact c = map.get(name);

        contacts.remove(c);
        map.remove(name);
        phoneSet.remove(c.phone);

        System.out.println("Contact Deleted Successfully.");
    }

  
    public static void displayContacts() {

        Collections.sort(contacts);

        System.out.println("\n----- Contact List -----");

        for (Contact c : contacts) {
            System.out.println(c);
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {

        addContact("Rahul", "9876543210", "rahul@gmail.com");
        addContact("Amit", "9123456789", "amit@gmail.com");
        addContact("Priya", "9988776655", "priya@gmail.com");

        // Duplicate phone number
        addContact("Riya", "9876543210", "riya@gmail.com");

        System.out.println("\nSearching Rahul:");
        searchContact("Rahul");

        System.out.println("\nDeleting Amit:");
        deleteContact("Amit");

        displayContacts();
    }
}