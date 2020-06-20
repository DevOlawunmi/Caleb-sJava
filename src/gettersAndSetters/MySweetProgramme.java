package gettersAndSetters;

public class MySweetProgramme {
    public static void main(String[] args) {
User person1 = new User();
person1.setFirstName("Abolade");
person1.setLastName("Oshodi");
        System.out.println(person1.getFirstName() + " " + person1.getLastName());
person1.fullName();
Employee employee1 = new Employee();
employee1.setName("Ola");
employee1.setEmployeeID(23765);
employee1.setSalary(45000);
        employee1.employeeDetails();
    }
}
