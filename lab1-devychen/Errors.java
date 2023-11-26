/*
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab
 * Author:      Yifei Chen
 * Description: Correcting basic errors in Java grammer/syntax
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from: No one in designing and debugging my program.
 */

import java.util.Scanner; //Import the Scanner class

public class Errors
{
 public static void main(String[] args)
 {
  System.out.println("Can you spot and fix the errors?");

  System.out.println("Enter two numbers and I ");
  System.out.println("add them for you");

  int n1, n2;

  Scanner keyboard = new Scanner(System.in); // add a semicolon at the end of a completed statement
  // but VS Code keeps suggesting me to surround it with try-with-resources, should I?
  
  n1 = keyboard.nextInt(); // read data from standard input stream keyboard
  n2 = keyboard.nextInt(); // read data from standard input stream keyboard. Name convention: use Uppercase to punctuate.

  System.out.println("The sum of the numbers is"); // Correct 'System' to 'System.out'
  System.out.println(n1 + n2); //sum means add, not minor
 }
}
