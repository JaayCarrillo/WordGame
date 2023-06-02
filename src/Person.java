import java.util.Scanner;

public class Person {
    /*
    private variables of String firstName & String lastName
     */
    private String firstName;
    private String lastName;

    // created two private instances of fName &&  lName //


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

        /*
        Getters & Setters
         */

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

        /*
        We are going to create a method that introduces our person
         */

    public void introducePerson() {
        System.out.println("Hello, my name is: " + firstName + " " + lastName );
    }


}