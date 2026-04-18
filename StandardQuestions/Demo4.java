//WAJP to print Product of N numbers
package standard;
import java.util.Scanner;
public class Demo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Product of N values");
		System.out.println("Enter value of N: ");
		int n=sc.nextInt();
		int product=1;
		
		for(int i=1;i<=n;i++) {
			product = product*i;
			System.out.println("Product of Numbers: "+product);
		}
		

	}

}

