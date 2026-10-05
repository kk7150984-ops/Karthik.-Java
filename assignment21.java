class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating two Student objects
        Student s1 = new Student("Rahul", 85);
        Student s2 = new Student("Priya", 92);

        // Displaying details
        s1.display();
        System.out.println();

        s2.display();
    }
}
