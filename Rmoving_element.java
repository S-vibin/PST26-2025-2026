package PST;
import java.util.Scanner;
public class Rmoving_element {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		while(num>0) {
			int rev=num%10;
			
			System.out.print(rev);
			break;
		}

	}

}
