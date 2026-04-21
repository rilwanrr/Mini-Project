import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarksSystem {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addStudent() {
        Student s = new Student();

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter mark 1: ");
        s.m1 = sc.nextInt();

        System.out.print("Enter mark 2: ");
        s.m2 = sc.nextInt();

        System.out.print("Enter mark 3: ");
        s.m3 = sc.nextInt();

        list.add(s);
        System.out.println("Student added successfully.");
    }

    static void displayStudents() {
        if (list.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : list) {
            s.display();
        }
    }

    static void searchStudent() {
        sc.nextLine();
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        for (Student s : list) {
            if (s.name.equalsIgnoreCase(name)) {
                s.display();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void updateStudent() {
        sc.nextLine();
        System.out.print("Enter name to update: ");
        String name = sc.nextLine();

        for (Student s : list) {
            if (s.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new mark 1: ");
                s.m1 = sc.nextInt();

                System.out.print("Enter new mark 2: ");
                s.m2 = sc.nextInt();

                System.out.print("Enter new mark 3: ");
                s.m3 = sc.nextInt();

                System.out.println("Updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        sc.nextLine();
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equalsIgnoreCase(name)) {
                list.remove(i);
                System.out.println("Deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== STUDENT MARKS SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);
    }
}
