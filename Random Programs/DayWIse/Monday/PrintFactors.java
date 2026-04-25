//Print sum of factors in between ranges.
package Monday;
import java.util.Scanner;
public class PrintFactors {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b=sc.nextInt();
		
		for (int i=a;i<=b;i++) {
		int fac=i;
		for(int j=1;j<=fac;j++) {
			if(fac%j==0) {
				System.out.println(j+" ");
			}
		}
		}
	}
}
