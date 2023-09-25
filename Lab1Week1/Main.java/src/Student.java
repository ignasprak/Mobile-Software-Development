// the start of a student class, with the point of it being inheritance with the extends keyword
public class Student extends Person implements PublishDetails {

    private String courseCode;
    private int studentID;

    private static int nextStudentID = 1000;

    // a constructor of the Person class, with extra fields
    public Student(String name, char gender, String studentID, String courseCode) {
        super(name, gender);
        this.courseCode = courseCode;
        this.studentID = nextStudentID;
        nextStudentID++; // increment studentID so that each new Student object created, it adds 1
    }

    @Override
    public String toString() {
        return super.toString() +  
        "\nStudent ID: " + studentID + 
        "\nCourse code: " + courseCode;
    }

    public void confirmDetails() {
        String studentDetails = toString();
        System.out.println(studentDetails);
        System.out.println("Details confirmed!");        
    }

    public String getCourseCode() {
        return courseCode;
    }
    
}
