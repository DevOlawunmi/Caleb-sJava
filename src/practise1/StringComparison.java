package practise1;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        String password = "Let me in";
        System.out.println("Guess the password :");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        if (password.equals(guess))
        //this is the right way to compare objects eg Strings. This is because the value the obj contains is a reference to the obj
        //for primitives eg int password==guess would work because primitives directly contain the value they store
        {
            System.out.println("Voila, you're in!");//this will run if the condition evaluates to true
        }
        else {
            System.out.println("Please try again");// this will run if the condition evaluates to false
        }

        System.out.println("This line of code will run whether true or false");
    }
}