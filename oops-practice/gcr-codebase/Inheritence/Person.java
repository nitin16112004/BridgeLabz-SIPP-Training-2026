// Interface
interface Worker {
    void performDuties();
}

// Superclass
class Person {
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display details
    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID   : " + id);
    }
}

// Subclass Chef
class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " prepares and cooks food.");
    }
}

// Subclass Waiter
class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " serves customers and takes orders.");
    }
}

