import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {

        try {
            // Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "password");

            Statement stmt = con.createStatement();

            // Create Students table
            String createTable = """
                CREATE TABLE Students (
                    student_id INT PRIMARY KEY,
                    name VARCHAR(50) UNIQUE,
                    age INT,
                    date_of_birth DATE,
                    email_id VARCHAR(100) UNIQUE,
                    phone_number VARCHAR(15) NOT NULL,
                    address VARCHAR(200)
                )
                """;

            stmt.executeUpdate(createTable);

            // Insert three records
            String insert = """
                INSERT INTO Students
                (student_id, name, age, date_of_birth, email_id, phone_number, address)
                VALUES
                (101, 'Rahul', 20, '2006-05-10', 'rahul@gmail.com', '9876543210', 'Bangalore'),
                (102, 'Priya', 19, '2007-02-15', 'priya@gmail.com', '9876543211', 'Mysore'),
                (103, 'Kiran', 21, '2005-08-20', 'kiran@gmail.com', '9876543212', 'Hubli')
                """;

            stmt.executeUpdate(insert);

            System.out.println("Table created and records inserted successfully.");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
