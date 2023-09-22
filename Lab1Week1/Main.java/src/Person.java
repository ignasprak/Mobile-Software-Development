public class Person {
    
    private String name;
    private char gender;

    // constructor
    public Person(String name, char gender){
        this.name = name;
        this.gender = gender;
    }

    // encapsulation

    // getters
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender; 
    }

    public String toString() {
        return "Name: " + name + "\nGender: " + GenderConverter.convertCharToGender(gender);
    }
}
