package PST;
import java.util.Scanner;
public class Swap_not3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("enter the number in a:");
		int a=sc.nextInt();
		System.out.print("enter the number in b:");
		int b=sc.nextInt();
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.print("a="+ a+"  " + "b="+b);
		 
		

	}

}
