import java.util.Scanner;

public class Person {
    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // created two private instances of fName &&  lName //
    private String firstName;
    private String lastName;


    // created two overloaded constructors
    public Person (String firstName) {
        this.firstName = firstName; // takes fName as a string
        this.lastName = ""; // takes lName as blank
    }
    // overloaded constructor
    // passes firstName & lastName as Strings
    public Person(String firstName, String lastName){
        this.firstName = firstName; // assigns fName to firstName
        this.lastName = lastName; // assigns lName to lastName
    }
}