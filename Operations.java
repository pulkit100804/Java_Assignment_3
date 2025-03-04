import java.util.*;

public class StudentOperations {
    Student students[] = new Student[100]; 
    int count = 0;
    Scanner sc = new Scanner(System.in);
    public void addStudent() {      //Adding a student feature
        if (count >= 100) {
            System.out.println("array full");
            return;
        }
        System.out.print("Enter PRN: ");
        String prn = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        students[count] = new Student(prn, name, marks);
        count++;
        System.out.println("Student added");
    }
  // Printing details of students or searching of students
    public void displayStudents() {
        if (count == 0) {
            System.out.println("No students found!");
            return;
        }
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    //  Searching Student by PRN
    public void searchByPRN() {
        System.out.print("Enter PRN to search: ");
        String prn = sc.next();
        for (int i = 0; i < count; i++) {
            if (students[i].prn.equals(prn)) {
                students[i].display();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Update Student Marks
    public void updateStudent() {
        System.out.print("Enter PRN to update: ");
        String prn = sc.next();
        for (int i = 0; i < count; i++) {
            if (students[i].prn.equals(prn)) {
                System.out.print("Enter new Marks: ");
                students[i].marks = sc.nextInt();
                System.out.println("Student updated!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
    public void deleteStudent() {
        System.out.print("Enter PRN to delete: ");
        String prn = sc.next();
        for (int i = 0; i < count; i++) {
            if (students[i].prn.equals(prn)) {
                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                count--;
                System.out.println("Student deleted!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
