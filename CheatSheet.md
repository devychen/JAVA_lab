**Concepts**: OOP, object, method, variable, constant, package (a liberal of classes)
**Data types**: Primitive & Class: `byte` -> `short` -> `int` -> `long` -> `float` -> `double` <br>
**Type Casting**: int varName = (int) varName
**Name convention**: type varNameStartLower, ClassNameUpper
**Keyboard Input** <br>
`import java.util.Scanner;` // class Scanner is part of java.util pkg, import source file <br> 
`Scanner keyboard = new Scanner(System.in);` // create an object of the Scanner class <br>
`int n1 = keyboard.nextIn();` // read data (an int e.g) <br>
**Keyboard Output**
`System.out.println("The count is" + count);` // `System.out` is an object
`println` next item start on a new line, `print` continue on same line.
**Operators**: <br>
Arithmetic expressions (+, -, !, ++, --; *, /, % mod), operands - 操作符 <br>
`amount = amount + 5;` equals `amount += 5;`, also have `-+`, `*=` <br>
Increment operator `++`, decrement `--`: prior before var <br>
`int m =4;`, `int result = 3 * (++m);`, m = 5, result = 15. If `(m++)`, m = 5, result = 2;
**String methods**: <br>
`charAt(index)` returns the char at Index. Position (i.e.index) starts with 0 not 1, space incl.
`compareTo(A_String)` returns negative integer if lexicographically first, zero if equal, positive if A_String first.
`concat(A_String)`returns a new string concatenated.
`equals(Other_String)` returns if strings are equal, false otherwise.
`equalsIgnoreCase(Other_String)` similar
`indexOf(Sub_String)` returns the index of the first occurence of substring. -1 if A is not found.
`lastIndexOf(Sub_String)` returns ... last occurence.
`length()` returns the length.
'toLowerCase()' returns in lowercase.
`toUpperCase()` ... in uppercase.
`replace(OldChar, NewChar)` returns with each occurence of OldChar replaced by NewChar.
`substring(Start)` returns substring begins at index Start to the end.
`substring(Start, End)` returns from index Start to End.
`trim()` returns with leading and trailing whitespace removed.
**Escape characters** <br>
`\"` double quote, `\'` single quote, `\\` backslash <br>
`\n` new line, `\r` carriage return, `\t`tab <br>

