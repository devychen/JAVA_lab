/** 
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 04
 * Author:      Yifei Chen
 * Description: Compute odd number integers.
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from no one in designing and debugging my program.
 */

import java.util.Scanner;

public class ComputeOddNumbers {

    // calculate, method
    private static int computeMethod(int n){
        int sum = 0;
        int currentOdd = 1;

        for (int i = 0; i < n; i++){
            sum += currentOdd;
            currentOdd += 2; //next odd integer;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Input
        System.out.println("Enter a positive integer (n):");

        // check valid
        if(keyboard.hasNextInt()){
            int n = keyboard.nextInt();

                if(n > 0){
                    // calculate
                    int sum = computeMethod(n);
                    //print
                    System.out.println("The sum of the first " + n + " positive odd integers is: " + sum);
                } else {
                    System.out.println("Invalid input.");
                }
        } else {
            System.out.println("Invalid input.");
        }
        keyboard.close();
    }

}
