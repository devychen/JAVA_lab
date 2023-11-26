/*
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab
 * Author:      Yifei Chen
 * Description: Print a static picture of stairs.
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from: No one in designing and debugging my program.
 */

public class Stairs0 {
    public static void main(String[] args) {
        String[] staircases = {
        "            +---+",
        "            |   |",
        "        +---+---+",
        "        |   |   |",
        "    +---+---+---+",
        "    |   |   |   |",
        "+---+---+---+---+",
        "|   |   |   |   |",
        "+---+---+---+---+"
        };
        
        // Print the stairs
        for (String stairs : staircases) {
            System.out.println(stairs);
        }
    }
}
