/* Name - Pulkit Shrivastava
  * PRN - 23070126098
  * Batch - B1*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentOperations operations = new StudentOperations();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1: operations.addStudent(); break;
                case 2: operations.displayStudents(); break;
                case 3: operations.searchByPRN(); break;
                case 4: operations.updateStudent(); break;
                case 5: operations.deleteStudent(); break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
