// Parent class inheritance 
class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class inheritance 
class StudentextendPerson extends Person {
    int rollNo;

    void displayStudent() {
        System.out.println("RollNo: " + rollNo);
    }
}

public class Test {
    public static void main(String[] args) {

        StudentextendPerson s = new StudentextendPerson();
        StudentextendPerson s1 = new StudentextendPerson();
        StudentextendPerson s2 = new StudentextendPerson();


        // Accessing parent class variables 
        s.name = "Saran raj";
        s.age = 18;

        // Accessing child class variables 
        s.rollNo = 112534054;

        s1.name = "Rajkumar";
        s1.age = 20;
        s1.rollNo = 112534053;
         
        s2.name = "Raja";
        s2.age = 25;
        s2.rollNo = 112534052;


        // Call methods
        s.displayPerson();   // Parent class method
        s.displayStudent();  // Child class method
        
        s1.displayPerson();   // Parent class method
        s1.displayStudent();  // Child class method
        s2.displayPerson();   // Parent class method
        s2.displayStudent();  // Child class method

    }
}