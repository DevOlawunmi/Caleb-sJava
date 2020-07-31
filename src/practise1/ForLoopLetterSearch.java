package practise1;

import java.util.Scanner;

public class ForLoopLetterSearch {
    public static void main(String args[]){

        //Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A. For this we need to state 1.  Where are we starting from (int i = 0)
        //2. how long should we go on for ie condition(ie i <text.length) 3. How should we increment or move?(ie i++)
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
