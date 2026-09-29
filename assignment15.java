class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Rahul", 20);

        // Printing the object
        System.out.println(student);
    }
}
