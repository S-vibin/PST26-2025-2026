package PST;
import java.util.Scanner;
public class Palindrome_numbers {

	public static void main(String[] args) {
		int rev=0,rem,org,num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		org=num;
		while(num>0) {
			rem=num%10;
			rev=rev%10+rem;
			num=num/10;
		}
		if(org==rev) {
			System.out.print("the number"+org+"is palindrome");
		}
		else {
			System.out.print("the number" +org+"is not a palindrome");
		}
		

	}

}
