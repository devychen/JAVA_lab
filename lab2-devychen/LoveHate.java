/**
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  Lab
 * Author:      Yifei Chen
 * Description: Programme reconstruction
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from: no one in designing and debugging my program.
 */

/**
 File name: LoveHate.java

 This program does the following:
  Reads in a line of text
  then outputs the line with the first occurrence  of the word "hate"
  changed to the word "love."

 Assumptions:
  The line of text has at least one occurrence  of the word "hate"
  The word "hate" is all lower case.

 Author: Lew Rakocy
 email address: LRakocy@devrycols.edu
 Date: 2/14/99
 Last changed: Updated for 4th edition by Brian Durney, November 2004

 Unfortunately the Java Code Eater Virus has removed most of the code 
 from the program. Please reconstruct the program by means of the
 comments of the program. (Which fortunately have been spared by the virus.)

*/

import java.util.Scanner;

public class LoveHate
{
    public static void main(String[] args)
    {
		/*
			Create a new Scanner object 'keyboard' and connect it to stream
			System.in
		*/
        Scanner keyboard = new Scanner (System.in);
		/*
			Print prompt.
		*/
        
		System.out.println("Enter a line with the word \"hate\":");
		
        /*
			Read a line from 'keyboard' and store it in variable 'sentence'
		*/
		String sentence = keyboard.nextLine();

		/*
			Search for the first occurence of substring 'hate' in 'sentence'
		*/
        
		int index = sentence.indexOf("hate");

		System.out.println("I have rephrased that line to read: ");
		
		/*
			Replace the substring we have just found with string 'love' and
			print the changed sentence to System.out.
		*/

		String newsentence = sentence.replaceFirst("hate", "love");

		// 為什麼 sentence = ... 不可以？

        System.out.println(newsentence);
		
    }
}

