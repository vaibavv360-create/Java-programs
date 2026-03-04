import java.util.Scanner;

// Parent class
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class StudentextendPerson extends Person {

    int rollNo;
    int marks;
    char grade;

    void calculateGrade() {

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else if (marks >= 60)
            grade = 'D';
        else
            grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Performance: Excellent");
                break;
            case 'B':
                System.out.println("Performance: Very Good");
                break;
            case 'C':
                System.out.println("Performance: Good");
                break;
            case 'D':
                System.out.println("Performance: Average");
                break;
            case 'F':
                System.out.println("Performance: Fail");
                break;
        }
    }

    void displayStudent() {
        displayPerson();  // call parent method
        System.out.println("RollNo: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------------------");
    }
}

public class TestScores   {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        StudentextendPerson[] students = new StudentextendPerson[n];

        // Input
        for (int i = 0; i < n; i++) {

            students[i] = new StudentextendPerson();

            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Name: ");
            students[i].name = sc.nextLine();

            System.out.print("Age: ");
            students[i].age = sc.nextInt();

            System.out.print("RollNo: ");
            students[i].rollNo = sc.nextInt();

            System.out.print("Marks: ");
            students[i].marks = sc.nextInt();
            sc.nextLine();

            students[i].calculateGrade();
        }

        // Sorting High to Low
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (students[i].marks < students[j].marks) {

                    StudentextendPerson temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        // Display sorted list
        System.out.println("\n=== Students from High Score to Low Score ===");

        for (int i = 0; i < n; i++) {
            students[i].displayStudent();
        }

        sc.close();
    }
}
