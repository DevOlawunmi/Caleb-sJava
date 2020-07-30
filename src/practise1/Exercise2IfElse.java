package practise1;
/*
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose one unit costs 100.
print total cost for user.
 */

import java.util.Scanner;

public class Exercise2IfElse {
    public static void main(String[] args) {
        int minPurchaseForDiscount = 10;
        int costPerUnit = 100;
        int totalPurchase;
        System.out.println("How many units did you buy");
        Scanner scanner = new Scanner(System.in);
        totalPurchase = scanner.nextInt();
        scanner.close();
        double total = costPerUnit * totalPurchase ;
        double discount  = 0.10*total;
        if(totalPurchase>minPurchaseForDiscount){
            total = total-discount;
        }
        System.out.println("Your total is £"+ total);

    }
}
