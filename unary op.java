/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void main(String[] args) {
        int a = 5;
        boolean flag = true;

        System.out.println("Initial value of a = " + a);

        // Unary plus
        System.out.println("+a = " + (+a));

        // Unary minus
        System.out.println("-a = " + (-a));

        // Pre-increment
        System.out.println("++a = " + (++a));

        // Post-increment
        System.out.println("a++ = " + (a++));
        System.out.println("Value of a after a++ = " + a);

        // Pre-decrement
        System.out.println("--a = " + (--a));

        // Post-decrement
        System.out.println("a-- = " + (a--));
        System.out.println("Value of a after a-- = " + a);

        // Logical NOT
    System.out.println("flag = " + flag);
        System.out.println("!flag = " + (!flag));
    }
}
