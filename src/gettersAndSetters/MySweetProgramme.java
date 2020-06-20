package gettersAndSetters;

public class MySweetProgramme {
    public static void main(String[] args) {
User user = new User();
user.setFirstName("Abolade");
user.setLastName("Oshodi");
        System.out.println(user.getFirstName() + " " + user.getLastName());
user.fullName();
Employee employee1 = new Employee();
employee1.setName("Ola");
employee1.setEmployeeID(23765);
employee1.setSalary(45000);
        employee1.employeeDetails();
    }
}
