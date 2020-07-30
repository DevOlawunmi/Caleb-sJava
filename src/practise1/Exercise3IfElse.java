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

public class Exercise3IfElse {
    public static void main(String[] args) {
        int score;
        if (score>25) System.out.println("You score an F");
        else if ((score<=25&&score<45)) System.out.println("You score an E");;
    }
}
