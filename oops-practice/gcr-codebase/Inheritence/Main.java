class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}

class Student extends Person {
    private final int studentId; // final variable
    protected double gpa;

    // Constructor using super()
    public Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() +
                "\nStudent ID: " + studentId +
                "\nGPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    // Constructor using super()
    public GradStudent(String name, int age, int studentId,
                       double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() +
                "\nThesis: " + thesis;
    }
}

