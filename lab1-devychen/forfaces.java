/*
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  lab
 * Author:      Yifei Chen
 * Description: Printing a static picture of two faces using ASCII charactrers
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from: No one in designing and debugging my program.
 */

public class Faces0 {
    public static void main(String[] args) {
        // Define the layers of the face
        String[] faceLayers = {
            "  \\/-----\\/       |||||||||",
            " |||||||||||     |||||||||||",
            "|||       |||   |||       |||",
            " (| ^   ^ |)      < ^   ^ >",
            " /|   3   |\\      | \\___/ | ",
            "//|_______|\\\\     |_______|",
        };

        // Print the layers of the face
        for (String layer : faceLayers) {
            System.out.println(layer);
        }
    }
}
