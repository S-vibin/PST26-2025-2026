package PST;

public class Ascending_array {

	public static void main(String[] args) {
		int a[]= {4,23,2,45,7};
		for(int i=0;i<=4;i++) {
			System.out.print(a[i]);
			for(int j=i+1;j<=4;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
System.out.print("the ascending order:");
for(int i=0;i<=4;i++) {
	System.out.print(a[i]+" ");
}
	}

}
