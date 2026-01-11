/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        // Using relational + logical operators
        boolean result1 = (a < b) && (b < c); // true && true → true
        boolean result2 = (a > b) || (c == 30); // false || true → true
        boolean result3 = !(a == 10); // !(true) → false

        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);
        System.out.println("Result3 = " + result3);
    }
	
}
