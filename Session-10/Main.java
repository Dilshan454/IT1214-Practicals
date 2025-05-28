import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int exam1 = 0, exam2 = 0, exam3 = 0;
        String name;

        try {
            // Get and validate exam marks
            System.out.println("Enter mark 1: ");
            exam1 = sc1.nextInt();
            validateMark(exam1);

            System.out.println("Enter mark 2: ");
            exam2 = sc1.nextInt();
            validateMark(exam2);

            System.out.println("Enter mark 3: ");
            exam3 = sc1.nextInt();
            validateMark(exam3);

            // Clear buffer
            sc1.nextLine();

            // Get student's name
            System.out.println("Enter student's name: ");
            name = sc1.nextLine();

            // Create Student object
            Student s1 = new Student(name, exam1, exam2, exam3);

            // Display student's name and average score
            System.out.println("Student's name: " + s1.getName());
            System.out.println("Average score: " + s1.calculateAverage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        }

        sc1.close();
    }

    // Helper method for validation
    private static void validateMark(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid mark! Exam marks must be between 0 and 100.");
        }
    }
}
