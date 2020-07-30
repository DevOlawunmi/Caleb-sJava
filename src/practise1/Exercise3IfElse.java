package practise1;
/*
A school has following grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */

import java.util.Scanner;

public class Exercise3IfElse {
    public static void main(String[] args) {
        int score;
        System.out.println("Please enter your marks");
        Scanner scanner = new Scanner(System.in);
        score= scanner.nextInt();
        scanner.close();
        if (score<=25) System.out.println("You score an F");
        else if (score < 45) System.out.println("You score an E");
        else if (score<50) System.out.println("That's a D");
        else if (score<60) System.out.println("Good job, you got a C");
        else if(score<80) System.out.println("Great job, you got a B");
        else if (score<100) System.out.println("Excellent, you got an A");
        else System.out.println("Please enter a valid score");
    }
}
