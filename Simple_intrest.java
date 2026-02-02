package PST;
import java.util.Scanner;
public class Simple_intrest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the price:");
		int P=sc.nextInt();
		System.out.print("enter the rate:");
		int R=sc.nextInt();
		System.out.print("enter the year:");
        int T=sc.nextInt();
        
        int SI=(R*P*T)/100;
        System.out.print(SI);
	}

}
