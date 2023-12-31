# JAVA Key Summary

#### Printing to screen
`System.out.println("...");`   
`System.out` object, sent output  
`println` method, print in parentheses

#### Call/invoke object’s methods
`objectName.methodName(argumentsTheMethodsNeeds;`

#### Name of file aligns name of class with “.java”
#### Class to run
`public static void main(String[] args)`

#### OOP Terminology
- Java is an OOP (Object-Oriented Programming) language.
- **Objects** perform actions (**methods**). Same kind of objects have same set of methods + same kinds of data, but each object can have its own data values stored by **variables**. 
- An **algorithm** describes a means of performing an action.
- Errors: syntax/Runtime/Logic<br>
#### Variables
Declare var: `type varName`, example `int eggs;` (Must declare before use)<br>
Identifiers: Name, e.g. varName. Case sensitive. Could be letters, digits, (_), but NOT start with digit, avoid $/( )/(.)/(*) <br>
Assignment Statement: `eggs = 6;`, `eggs = eggs - 3;`, `avg = sum/count` (expression on the right-hand side of the assignment operator (=) is evaluated first)<br>

#### Data type
1. Class type: used for a class of objects and has both data and methods)<br>
2. Primitive: 
- Interger: `byte`, `short`, **`int`**, `long`
- Floating-point: `float`, **`double`**
- Single character: **`char`**
- Boolean: **`boolean`**
3. Name Convention:<br>
1/ Class type `String`, 2/ Primitive type `int`, 3/ Varname `myName` "puncutated" using uppercase letters<br>

#### Class `String`<br>

#### Keyboard and Screen I/O
`import java. util.Scanner;` //Keyboard input by [Scanner] object<br>
`Scanner keyboard = new Scanner(System.in);` and then enter data<br>

