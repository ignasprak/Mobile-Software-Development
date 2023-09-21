/* This is a class made to convert a char from the gender variable into a string,
* so it would be easier to read when reading the final output of the program
*/

public class GenderConverter {
    public static String convertCharToGender(char genderChar) {
        String gender;
        switch (genderChar) {
            case 'M':
            case 'm':
                gender = "\"Male\"";
                break;
            case 'F':
            case 'f':
                gender = "\"Female\"";
                break;
            case 'U':
            case 'u':
                gender = "\"Universal\"";
                break;
            default:
                gender = "\"Unknown\"";
        }
        return gender;
    }

    public static void main(String[] args) {
        char genderChar = 'm';
        String gender = convertCharToGender(genderChar);
        System.out.println("Gender: " + gender); 
    }
}
