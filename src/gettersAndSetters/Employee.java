package gettersAndSetters;

public class Employee {

    private String name;
    private int employeeID;
    private double salary;

    public void setName(String nom){
       name = nom;
    }
    public String getName(){
        return name;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(int eID){
        employeeID=eID;
    }
    public void setSalary(double sal){
        salary = sal;
    }
    public double getSalary(){
        return salary;
    }
    public void employeeDetails(){
        System.out.println(name + " " + employeeID+ " "+ salary);
    }
}
