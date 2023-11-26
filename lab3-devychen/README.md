[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/WwgPH8LZ)
# Lab 3
The deadline for submitting the lab is **Friday, Nov 10th 14.00pm CET**.
As always:
* Make sure your code compiles or you will get 0 points
* Use proper indentation (`SHIFT`+`ALT`+`F`)
* Use the correct class name
* Don't use non-ASCII characters
* Put the honor code at the start of *each* file you submit
* Put meaningful comments in your code
* Only use things you learned in class (if you're not sure about something, just ask!)
* **Make sure the output looks exactly as in the example**

Honour Code:
<pre>
/**
 * Course:      Data Structures and Algorithms for Computational Linguistics I WS23/24
 * Assignment:  (lab, exercise)
 * Author:      (Your Name)
 * Description: (What does the program do?)
 *
 * Honor Code:  I pledge that this program represents my own work.
 *  I received help from:
 *   (enter the names of others that helped with the assignment, or
 *   no one if you received no help)
 *  in designing and debugging my program.
 */
 </pre>

## Exercise 1
A store wants a program `TaxProgram` that calculates the tax on an item of clothing. An item that costs Euro 100 or more has a 5% tax.

For an item that costs less than Euro 100 the customer must not pay taxes.

Write a program that asks for a price, calculates the tax, then prints the price, the tax and the total cost.

For now, we don't care that the tax or the total is calculated wrong sometimes. We will learn how to do a proper rounding later this semester.

### Example output:
```
Enter the price: 120
Item cost: 120.0 Tax: 6.0 Total: 126.0
Enter the price: 56
Item cost: 56.0 Tax: 0.0 Total: 56.0
Enter the price: 114.67
Item cost: 114.67 Tax: 5.7335 Total: 120.40350000000001
```
**(4 points)**


## Exercise 2
Write a program `UpcaseSuffix.java` which reads a word `w` and an integer `l` and outputs word `w` with the last `l` characters in upper case.

Add comments that describe the flow of your program and don't forget the usual program header.

Please make sure that integer `l` is in the bounds of word `w`. Print an error message if `l` is outside the bounds of `w`.

### Example output:
```
Enter a word
Directory
Enter a number
4
DirecTORY
```
**(4 points)**
