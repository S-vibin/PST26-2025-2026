package PST;
import java.util.Scanner;
public class Int_to_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int d=sc.nextInt();
		String str=Integer.toString(d);
		
        System.out.print(str);
	}

}
