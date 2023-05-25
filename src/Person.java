import java.util.Scanner;

public class Person {
    // created two private instances of fName &&  lName //
    private String fName;
    private String lName;

    // set my getters and setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    // created two overloaded constructors
    public Person (String fName) {
        this.fName = fName; // takes fName as a string
        this.lName = ""; // takes lName as blank
    }
    // overloaded constructor
    // passes firstName & lastName as Strings
    public Person(String firstName, String lastName){
        this.fName = firstName; // assigns fName to firstName
        this.lName = lastName; // assigns lName to lastName
    }




}