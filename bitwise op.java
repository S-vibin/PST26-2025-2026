/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void main(String[] args) {
        int a = 5;   // binary: 0101
        int b = 3;   // binary: 0011

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); // 0101 & 0011 → 0001 → 1

        // Bitwise OR
        System.out.println("a | b = " + (a | b)); // 0101 | 0011 → 0111 → 7

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); // 0101 ^ 0011 → 0110 → 6

        // Bitwise Complement
        System.out.println("~a = " + (~a)); // ~0101 → ...1010 → -6 (two’s complement)

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 → 1010 → 10

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 → 0010 → 2
    }
}
