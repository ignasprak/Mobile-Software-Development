/* Q.3  Create a Student class to become a a subclass of Person. In addition to name and
 *      gender, student should hold a studentId and courseCode.
 * 
 *      Add a constructor to the Student class that initialises all four instance variables to
 *      values passed in as parameters. (Don’t forget to make use of the constructor from
 *      the Person superclass).
 * 
 *      Add a toString() method to the Student class that prints out the four student
 *      details. Make sure to re-use Person class methods where you can.
*/

// the start of a student class, with the point of it being inheritance with the extends keyword
public class Student extends Person implements PublishDetails {

    private String studentID;
    private String courseCode;

    // a subclass of the Person class, with extra fields
    public Student(String name, char gender, String studentID, String courseCode) {
        super(name, gender);
        this.studentID = studentID;
        this.courseCode = courseCode;
    }

    @Override
    public String toString() {
        return super.toString() +  
        "\nStudent ID: " + studentID + 
        "\nCourse code: " + courseCode;
    }

    @Override
    public void confirmDetails() {
        String studentDetails = toString();
        System.out.println(studentDetails);
        System.out.println("Details confirmed!");        
    }

    @Override
    public String getCourseCode() {
        return courseCode;
    }
    
}
