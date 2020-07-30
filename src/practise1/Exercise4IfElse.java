package practise1;
/*
A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

 */

import java.util.Scanner;

public class Exercise4IfElse {
    public static void main(String[] args) {
        System.out.println("How many classes were held in total");
        Scanner scanner = new Scanner(System.in);
        int totalNoOfClasses = scanner.nextInt();
        System.out.println("How many classes did student attend?");
       double noOfClassesAttended =  scanner.nextInt();
       scanner.close();
       double percentageAttendance = (noOfClassesAttended/totalNoOfClasses)*100;
       if (percentageAttendance>=75)
        System.out.println("Attendance is "+ percentageAttendance+ "%" + ". Student is allowed to write the exam");
       else System.out.println("Attendance is " + percentageAttendance+ "%" + "" +
               ". Please contact the administrator");

    }

}
