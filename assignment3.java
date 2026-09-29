public class StudentGrade {
    public static void main(String[] args) {
        int marks = 95;

        // Check if the student has passed
        if (marks >= 70) {
            System.out.println("Student has passed the exam.");

            // Assign Grade A for marks above 90
            if (marks > 90) {
                System.out.println("Grade: A");
            }
        } else {
            System.out.println("Student has failed the exam.");
        }
    }
}
