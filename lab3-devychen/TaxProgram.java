/** 
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab 03
 * Author:      Yifei Chen
 * Description: tax and cost calculation.
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from no one in designing and debugging my program.
 */

import java.util.Scanner;

public class TaxProgram {
    public static void main(String[] args) {

        // asks for a price
        Scanner keyboard = new Scanner (System.in);
        
        for (int i = 0; i < 3; i++){
            System.out.print("Enter the price: ");
            double price = keyboard.nextDouble();

            // calculates the tax. >=100 5%, <100 0%.
            double taxRate = 0.05;
            double tax;

            if (price >= 100){
                tax = price * taxRate;
            } else tax = 0;

            // prints the price, the tax and the total cost
            double total = price + tax;
            System.out.println("Item cost: " + price + " Tax: " + tax + " Total: " + total);
        }
        keyboard.close();
    }   
}
