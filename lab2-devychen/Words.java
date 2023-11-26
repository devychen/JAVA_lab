/**
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  Lab
 * Author:      Yifei Chen
 * Description: Programme reconstruction
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from: no one in designing and debugging my program.
 */

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter three words: ");
        String word1 = keyboard.next();
        String word2 = keyboard.next();
        String word3 = keyboard.next();

        // Word one as uppercase
        String word1UpperCase = word1.toUpperCase();
        System.out.println("\nWord one as uppercase: " + word1UpperCase);


        // Second word as lowercase
        String word2LowerCase = word2.toLowerCase();
        System.out.println("Second word as lowercase: " + word2LowerCase);

        // First two characters of word three
        String firstTwoCharacters = word3.substring(0, 2);
        System.out.println("First two characters of word three: " + firstTwoCharacters);
    }
}
