import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FeesManagementSystem feesManagementSystem = new FeesManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Add students
        Student student1 = new Student("20213001", "jay prakash kumar", 6000000);
        Student student2 = new Student("20213002", "bitu singh", 6000000);
        Student student3 = new Student("20213003", "shubh adhikary", 6000000);
        Student student4 = new Student("20213004", "chhotu singh", 6000000);
        Student student5 = new Student("20213005", "jay singh", 6000000);
        feesManagementSystem.addStudent(student1);
        feesManagementSystem.addStudent(student2);
        feesManagementSystem.addStudent(student3);
        feesManagementSystem.addStudent(student4);
        feesManagementSystem.addStudent(student5);


        // Collect fees
        feesManagementSystem.collectFees("20213001", 3005000);
        feesManagementSystem.collectFees("20213002", 2005500);
        feesManagementSystem.collectFees("20213003", 1570000);
        feesManagementSystem.collectFees("20213004", 4800000);
        feesManagementSystem.collectFees("20213005", 5000670);

        // Display student information
        System.out.print("Enter student ID to display information: ");
        String studentId = scanner.next();
        feesManagementSystem.displayStudentInfo(studentId);
    }
}