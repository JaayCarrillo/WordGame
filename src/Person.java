import java.util.Scanner;
public class Person {
    // instance variables 'firstName'
    public String firstName;
    // getter for 'firstName' //
    public String getFirstName() {
        return firstName;
    }
    // setter for 'firstName'//
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // instance variable of 'lastName'
    public String lastName;
    // getters and setters for person's last name //
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // 1. overloaded constructor
    // 1 .constructor accepts one 'String' as 'input'(persons firstName)
    public Students (String firstName, String lastName){
       this.firstName = firstName;
       this.lastName = "";
    }
    public Students(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}