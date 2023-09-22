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
