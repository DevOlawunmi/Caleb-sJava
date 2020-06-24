package gettersAndSetters;
/*
In Java, getter and setter are two conventional methods that are used for retrieving and updating the value of a variable.
So, a setter is a method that updates the value of a variable.
And a getter is a method that reads the value of a variable.
Getters and setters are also known as accessors and mutator in Java
 */

public class User {
    private String firstName;
    private String lastName;
// read the value of firstname and make it caps
    public String getFirstName(){
        return firstName.toUpperCase();
    }
    // assign fn to firstname ie update the value of firstname
    public void setFirstName(String fn){
        firstName = fn;
    }
    public String getLastName (){
        return lastName;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
public void fullName (){
    System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());
}
}
