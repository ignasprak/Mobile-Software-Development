import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

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

            // name input
            System.out.println("Enter details for Person " + (i + 1) + ":");

            // storing person in an array
            people[i] = inputPerson(input);
        
        }

        for (int i = 0; i < numStudents; i++) {
           // name input
            System.out.println("Enter details for Student " + (i + 1) + ":");

            // storing person in an array
            students[i] = inputStudent(input);        }

        // data about all created objects
        System.out.println("\nRecord of people: ");
        for (Person person : people) {
            System.out.println(person.toString());
        }

        System.out.println("\nRecord of students: ");
        for (Student student : students) {
            System.out.println(student.toString());
        }

        System.out.println();

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

        System.out.println();
        System.out.println("Please input your student number: ");
        String studentID = input.nextLine();    

        System.out.println();
        System.out.println("Please input your course code: ");
        String courseCode = input.nextLine();    

        return new Student(name, gender, studentID, courseCode);
    }  
}


