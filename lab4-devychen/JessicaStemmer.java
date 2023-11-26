
/**
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 4, Ex 1
 * Author:      Chi Kuan Lai
 * Description: build stemmer program
 *
 * Honor Code:  I pledge that this program represents my own work.
 */

import java.util.Scanner;

public class Stemmer {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Scanner smallscanner;
        System.out.println("Enter your words in the following line: ");

        String input = "";
        String word = "";
        String stem = "";

        while (keyboard.hasNextLine()) {
            // read words from line
            input = keyboard.nextLine();
            smallscanner = new Scanner(input);
            // empty line
            System.out.println();

            while (smallscanner.hasNext()) {
                word = smallscanner.next();

                int wordLen = word.length();
                int lastFour = wordLen - 4;
                int lastThree = wordLen - 3;
                int lastTwo = wordLen - 2;
                int lastOne = wordLen - 1;
                // word ends in "ing" and is longer than 4 letters, remove the "ing".
                if (wordLen > 4 && word.substring(lastThree).equals("ing")) {
                    stem = word.substring(0, lastThree);
                    // word ends in "sses", remove the final "es".
                } else if (wordLen > 4 && word.substring(lastFour).equals("sses")) {
                    stem = word.substring(0, lastTwo);
                    // word ends in "ies", replace the "ies" with "y".
                } else if (wordLen > 3 && word.substring(lastThree).equals("ies")) {
                    stem = word.substring(0, lastThree) + "y";
                    // word ends in "s", but not in "sses", "ies", or "ss", then remove the final
                    // "s".
                } else if (wordLen > 3 && word.substring(lastOne).equals("s")
                        && !word.substring(lastFour).equals("sses") &&
                        !word.substring(lastThree).equals("ies") && !word.substring(lastTwo).equals("ss")) {
                    stem = word.substring(0, lastOne);
                    // word ends in "eed" and is longer than 4 letters, remove the final "d".
                } else if (wordLen > 4 && word.substring(lastThree).equals("eed")) {
                    stem = word.substring(0, lastOne);
                    // word ends in "ed" but not in "eed" and is longer than 4 letters, remove the
                    // final "ed".
                } else if (wordLen > 4 && word.substring(lastTwo).equals("ed")
                        && !word.substring(lastThree).equals("eed")) {
                    stem = word.substring(0, lastTwo);
                } else {
                    stem = word;
                }
                System.out.print(word + " - " + stem + "\n");
            }
            System.out.println();

        }
    }
}