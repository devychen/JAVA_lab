/** 
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 04
 * Author:      Yifei Chen
 * Description: Return words to stem class.
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from no one in designing and debugging my program.
 */

import java.util.Scanner;

public class StemmerEndWith {
    public static void main(String[] args) {

        // input
        Scanner keyboard = new Scanner(System.in);        
        System.out.println("Enter your words in the following line:");
        String wordlist = keyboard.nextLine();
        
        // seperate by space
        String[] words = wordlist.split(" ");

        // line break
        System.out.print("\n");

        // print results
        for(String word: words){
            String stem = returnStem(word);
            System.out.println(word + " - " + stem);
        
        keyboard.close();
        }
    }

    // stem method
    private static String returnStem(String word){
        
        // leave < 3;
        if(word.length() < 3){
            return word;
        }

        // different ends;
        if(word.endsWith("ing") && word.length() > 4){
            return word.substring(0, word.length() - 3);
        }
        if(word.endsWith("sses")){
            return word.substring(0, word.length() - 2);   
        } 
        if(word.endsWith("ies")){
            return word.substring(0, word.length() - 3) + "y";
        }  
        if(word.endsWith("s") && !word.endsWith("sses") && !word.endsWith("ies") && !word.endsWith("ss")) {
            return word.substring(0, word.length() - 1);
        }  
        if(word.endsWith("eed")) {
            return word.substring(0, word.length() - 1);
        }    
        if(word.endsWith("ed") && !word.endsWith("eed") && word.length() > 4) {
            return word.substring(0, word.length() - 2);
        }
        else {
            return word;
        }
    }
}