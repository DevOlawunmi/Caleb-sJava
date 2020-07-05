package practise1;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] grades = {58, 89, 87, 99, 67, 88, 76};
        // System.out.println(grades);//this command does not work
        //System.out.println(Arrays.toString(grades));//this prints the elements in an array without a loop

        //if we dont know all the values beforehand
        int[] scores = new int[5];
        Arrays.fill(scores, 5);
        System.out.println(Arrays.toString(scores));

    }
}
