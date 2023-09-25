/*
 *  TITLE: People Education Records
 *  AUTHOR: Ignas Prakapas (c20424992)
 *  DESCRIPTION: This is a program made to go over the basics of OOP, this involve the four pillars of
 *  OOP. In this program there is a dynamic object system for both the person class and the student 
 *  subclass. 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello and welcome to the People Education system!");
        System.out.println("In the next message, you will have to specify how many people you are inserting,");
        System.out.println("and then how many students you will be inserting.");
        System.out.println();
        
        // user input for the number of people and students
        System.out.println("Enter the number of people:");
        int numPeople = input.nextInt();
        input.nextLine(); // Consume the newline character
        System.out.println("Enter the number of students:");
        int numStudents = input.nextInt();
        input.nextLine(); // Consume the newline character

        // arrays for people and students
        Person[] people = new Person[numPeople];
        Student[] students = new Student[numStudents];

        // this loop is for which people object data is being "edited"
        for (int i = 0; i < numPeople; i++) {

            System.out.println();
            // name input
            System.out.println("Enter details for Person " + (i + 1) + ":");

            // storing person in an array
            people[i] = inputPerson(input);
        
        }

        for (int i = 0; i < numStudents; i++) {

            System.out.println();
            // name input
            System.out.println("Enter details for Student " + (i + 1) + ":");

            // storing person in an array
            students[i] = inputStudent(input);       
        }

        // data about all created objects
        System.out.println("\nRecord of people: ");
        for (Person person : people) {
            System.out.println(person.toString());
            System.out.println();
        }

        System.out.println("\nRecord of students: ");
        for (Student student : students) {
            System.out.println(student.toString());
            System.out.println();
        }

        System.out.println();

        // checking using isntanceof 
        
            // Check if object Person is of the expected type
            for (int i = 0; i < numPeople; i++) {
                if ((i < numPeople && people[i] instanceof Person)) {
                System.out.println("An object exists for Person: " + (i + 1));
                }
            }

            // Check if object Student is of the expected type
            for (int i = 0; i < numStudents; i++) {
                if ((i < numStudents && students[i] instanceof Student)) {
                System.out.println("An object exists for Student: " + (i + 1));
                }
            }

        // closing the scanner input
        input.close();
    }

    public static Person inputPerson(Scanner input) {

        System.out.println();
        System.out.println("Please input your name: ");
        String name = input.nextLine();            

        char gender;

        // gender input validation loop
        do {
            System.out.println();
            System.out.println("Please input your gender as M(Male), F(Female) or U(Universal)");
            String genderInput = input.next();
            gender = genderInput.charAt(0);
            input.nextLine(); // consume the newline character

            if (gender == 'M' || gender == 'F' || gender == 'U' || gender == 'm' || gender == 'f' || gender == 'u') {
                break; // if valid input, exit
            } 
            
            else {
                System.out.println("Invalid gender input. Please try again.");
            }
        } while (true);

        return new Person(name, gender);
    }   

    public static Student inputStudent(Scanner input) {

        System.out.println();
        System.out.println("Please input your name: ");
        String name = input.nextLine();            

        char gender;

        // gender input validation loop
        do {   
            System.out.println();
            System.out.println("Please input your gender as M(Male), F(Female) or U(Universal)");
            String genderInput = input.next();
            gender = genderInput.charAt(0);
            // consume the newline character
            input.nextLine(); 

            if (gender == 'M' || gender == 'F' || gender == 'U' || gender == 'm' || gender == 'f' || gender == 'u') {
                // if valid input, exit
                break; 
            } 
            
            else {
                System.out.println("Invalid gender input. Please try again.");
            }
        } while (true);

        System.out.println();
        System.out.println("You are being given a Student Number: ");
        String studentID = input.nextLine();    

        System.out.println();
        System.out.println("Please input your course code: ");
        String courseCode = input.nextLine();    

        System.out.println();
        return new Student(name, gender, studentID, courseCode);

    }  
}



