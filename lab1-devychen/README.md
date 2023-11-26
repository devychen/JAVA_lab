[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/0aTXjhi3)
# lab1         

## Reminders

The deadline for submitting the lab is **Friday, Oct 27th 2:00PM CET**. Until then you can modify your files as much as you'd like, we will only consider your final pushes. For all the questions you may have, please use the **Issues** page in the **home** repository.





These are some general things you should keep in mind now and for all future labs. If you do not follow them, points may be deducted.

- **Make sure your code compiles**. Test it yourself before submitting! You will receive 0 points for any file that does not compile.
- **Make sure you do NOT use any methods, classes etc. that we did not cover in the lecture!** It is important that you learn the basics. If you are not 100% sure whether you are allowed to use a certain approach, post a question in the Issues page.
- **Make sure your output looks exactly the same as what is expected in the exercise.**
- **Your class name and your file name are supposed to be the same.** (Example: class name: Stairs ; file name: Stairs.java). Use the class name we give you in the assignment.
- **Don't use non-ASCII characters in your code**, otherwise the compiler might fail.
- **Don't forget to write meaningful comments** (this part is really helpful for us to better understand your thread of thought, so if things go wrong we could give partial points)
- **Make sure your code is indented properly** and be consistent with the formatting (most convenient way for Visual Studio Code: Shift+Alt+F)
- **Begin all your java files with the honour code.**
  
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
Write a program <code>Stairs.java</code> which prints the following stairs to the terminal: 

<pre>
            +---+
            |   |
        +---+---+
        |   |   |
    +---+---+---+
    |   |   |   |
+---+---+---+---+
|   |   |   |   |
+---+---+---+---+
</pre>


**(2 points)**

## Exercise 2

Open the file <code>Errors.java</code> with VSCode and correct the errors.

Line 12 reads <code>Scanner keyboard = new Scanner(System.in)</code>. 
This statement creates a <code>Scanner</code> object that can be used
to read data from a stream (allow the user to enter some information into the program). In this case it will read from the standard
input stream (your keyboard).	


**(5 points)**

## Exercise 3

Write a program <code>Faces.java</code> which prints at least 2 faces next to each other, consisting of
ASCII characters <u>only</u>, to the terminal. You can find a table of all ASCII characters <a href=https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html>here</a>.

#### Example:
<pre>
   ////            \|||/
 | o  o |        |       |
(|      |)      <  *   *  >
 |  \/  |        |  . .  |
 | \__/ |        |  ===  |
  ------         \_______/
</pre>

Make your own faces different from the examples. In this case the output is supposed to look different.


**(3 points)**


Don't forget to add <code>Faces.java</code> and <code>Stairs.java</code> to your Github repository using the add, commit, and push commands.

Good luck!