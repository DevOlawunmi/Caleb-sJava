package customArrays;


import gettersAndSetters.User;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        User person3= new User();
        person3.setFirstName("Sola");
        person3.setLastName("Olagunju");
        User person2 = new User();
        person2.setFirstName("Pelumi");
        person2.setLastName("Ajibola");
        List<User> users = new ArrayList<User>();
        users.add(person2);
        users.add(person3);




       // users.get(0).fullName();
        System.out.println(users.indexOf(person3));
            }
}
