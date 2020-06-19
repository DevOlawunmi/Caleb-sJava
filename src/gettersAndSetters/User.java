package gettersAndSetters;

public class User {
    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName.toUpperCase();
    }
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
    System.out.println(firstName + " " + lastName);
}
}
