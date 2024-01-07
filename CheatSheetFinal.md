**Name Convention**   
`Class` begin upperc <br>
`primitive` begin lowerc <br>
`variableOfBothTypes` begin lowercase, puntuated by upperc <br>
`CONSTANTS` all upper <br>

**Primitive Data Compatibility**: byte -> short -> int -> long -> float -> double

**Increment operator** `++`, **decrement** `--`: prior before var <br>
`int m =4;`, `int result = 3 * (++m);`, then m = 5, result = 15. If `(m++)`, then m = 5, result = 2; <br>


**`String` methods**: <br>
`charAt(index)` returns the char at Index. Position (i.e.index) starts with 0 not 1, space incl. <br>
`compareTo(A_String)` returns negative int if lexicographically* first, zero if equal, positive if A_String first. <br>
```
if (s1.compareTo(s2) < 0) // s1 < s2
if (s1.compareTo(s2) == 0) // equal
if (s1.compareTo(s2) > 0) // s1 > s2, namely comes lexicographically after s2
```
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

**`Scanner` class**
```
import java.until.Scanner;
// then public main{} public static {}
// then declare variables;
Scanner keyboard = new Scanner(System.in);
varName = keyboard.nextX;
System.out.prinln();
keyboard.close();
```

**Statements**

**一些语句**
1. **Declare constants**: <br>
`public static final type CONSTANTSNAME = value;` <br>
e.g. `public static final int MAX_ENTRIES = 100;` or `String MOTTO = "Science matters.";`
2. `public static void main(String[] args) {}`
