
/** 
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 03
 * Author:      Yifei Chen
 * Description: reads a word w and an integer l and outputs word w with the last l characters in upper case.
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from no one in designing and debugging my program.
 */

import java.util.Scanner;

public class UpcaseSuffix {
    public static void main(String[] args) {

        // input the word and number

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String w = keyboard.nextLine();
        System.out.println("Enter a number");
        int l = keyboard.nextInt();

        // condition: wordlength >= Upper suffix number
        if (l >= 0 && w.length() >= l){
            // output designated result
            System.out.println(w.substring(0, w.length() - l) + w.substring(w.length() - l).toUpperCase());
        } else // error message
            System.out.println("Error: l is outside the bounds of w.");

        keyboard.close();
    }
}
