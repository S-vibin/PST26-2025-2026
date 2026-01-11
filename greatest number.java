/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{

    public static void main(String[] args) {
        // Sample inputs
        int a = 25, b = 42, c = 17;

        // 1. Find the greatest number among the 3 numbers
        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Greatest number: " + greatest);

        
    }
}
