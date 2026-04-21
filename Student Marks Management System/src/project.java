import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int m1, m2, m3;

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return total() / 3.0;
    }

    String grade() {
        double avg = average();

        if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "D";
    }

    void display() {
        System.out.println("\nName   : " + name);
        System.out.println("Marks  : " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total  : " + total());
        System.out.println("Average: " + average());
        System.out.println("Grade  : " + grade());
    }
}

