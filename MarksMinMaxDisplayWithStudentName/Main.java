import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you have to enter: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            while (true) {
                System.out.print("Enter marks for " + names[i] + " : ");
                marks[i] = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 0 and 100.");
                }
            }
        }

        int sum = 0;
        int max = marks[0];
        int min = marks[0];
        String maxName = names[0];
        String minName = names[0];

        for (int i = 0; i < n; i++) {
            sum += marks[i];

            if (marks[i] > max) {
                max = marks[i];
                maxName = names[i];
            }
            if (marks[i] < min) {
                min = marks[i];
                minName = names[i];
            }
        }

        double average = (double) sum / n;

        System.out.println("\n--- Statistics ---");
        System.out.println("Average is: " + average);
        System.out.println("Highest marks: " + max + " by " + maxName);
        System.out.println("Lowest marks: " + min + " by " + minName);
    }
}
 //Best code for this is to construct a class
/*
import java.util.Scanner;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you want to add? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            int marks;
            while (true) {
                System.out.print("Enter marks for " + name + " (0 - 100): ");
                marks = scanner.nextInt();
                scanner.nextLine(); // consume newline
                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100.");
                }
            }

            students[i] = new Student(name, marks);
        }

        // Initialize stats
        int sum = 0;
        Student maxStudent = students[0];
        Student minStudent = students[0];

        for (Student student : students) {
            sum += student.marks;

            if (student.marks > maxStudent.marks) {
                maxStudent = student;
            }
            if (student.marks < minStudent.marks) {
                minStudent = student;
            }
        }

        double average = (double) sum / n;

        System.out.println("\n--- Statistics ---");
        System.out.println("Average marks: " + average);
        System.out.println("Highest marks: " + maxStudent.marks + " by " + maxStudent.name);
        System.out.println("Lowest marks: " + minStudent.marks + " by " + minStudent.name);
    }
}
* */