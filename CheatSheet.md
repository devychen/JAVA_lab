**Concepts**: OOP, object, method, variable, constant, package (a liberal of classes) <br>

**Data types**: Primitive & Class: `byte` -> `short` -> `int` -> `long` -> `float` -> `double` <br>

**Name convention**: type varNameStartLower, ClassNameUpper <br>

**Comments** `//` one line. `/* */` multiple lines <br>

**Type Casting**: int varName = (int) varName <br>

**Keyboard Input** <br>
`import java.util.Scanner;` class Scanner is part of java.util pkg, import source file <br> 
`Scanner keyboard = new Scanner(System.in);` create an object of the Scanner class <br>
`int n1 = keyboard.nextIn();` read data (an int e.g) <br>

**Keyboard Output** <br>
`System.out.println("The count is" + count);` `System.out` is an object
`println` next item start on a new line, `print` continue on same line. <br>

**Operators**: <br>
Arithmetic expressions (+, -, !, ++, --; *, /, % mod), operands - 操作符 <br>
`amount = amount + 5;` equals `amount += 5;`, also have `-+`, `*=` <br>
Increment operator `++`, decrement `--`: prior before var <br>
`int m =4;`, `int result = 3 * (++m);`, m = 5, result = 15. If `(m++)`, m = 5, result = 2; <br>

**String methods**: <br>
`charAt(index)` returns the char at Index. Position (i.e.index) starts with 0 not 1, space incl. <br>
`compareTo(A_String)` returns negative integer if lexicographically first, zero if equal, positive if A_String first. <br>
`concat(A_String)`returns a new string concatenated. <br>
`equals(Other_String)` returns if strings are equal, false otherwise. <br>
`equalsIgnoreCase(Other_String)` similar. <br>
`indexOf(Sub_String)` returns the index of the first occurence of substring. -1 if A is not found. <br>
`lastIndexOf(Sub_String)` returns ... last occurence. <br>
`length()` returns the length. <br>
`toLowerCase()` returns in lowercase. <br>
`toUpperCase()` ... in uppercase. <br>
`replace(OldChar, NewChar)` returns with each occurence of OldChar replaced by NewChar. <br>
`substring(Start)` returns substring begins at index Start to the end. <br>
`substring(Start, End)` returns from index Start to End. <br>
`trim()` returns with leading and trailing whitespace removed. <br>

**Escape characters** <br>
`\"` double quote, `\'` single quote, `\\` backslash <br>
`\n` new line, `\r` carriage return, `\t`tab <br>

**Scanner Methods `next`**: reads all the chars up to the next whitespace <br>
nextX for each primitives: `nextInt`, `nextBoolean`, `nextDouble` <br>
`nextLine()` reads remainder of current line even empty. <br>

