import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // creating a new person object, this is a dynamic approach
        Person[] people = new Person[2];

        //this loop is for which people object data is being "edited"
        for (int i = 0; i < people.length; i++) {

            // name input
            System.out.println("Enter details for Person " + (i + 1) + ":");
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

            // inserting into new object
            Person person = new Person(name, gender);

            // storing person in an array
            people[i] = person;
        
        }

        // data about all created objects
        System.out.println("\nInformation about created persons:");
        for (int i = 0; i < people.length; i++) {
            System.out.println();
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Name: " + people[i].getName());
            System.out.println("Gender: " + people[i].getGender());
        }

        System.out.println();

        // closing the scanner input
        input.close();

    }
}
