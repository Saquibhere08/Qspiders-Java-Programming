package standard;
import java.util.Scanner;
public class Demo13 {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Number(for factorial n): ");
	      int n=sc.nextInt();
	      int fact=0;
	      int sum=0;
	      for(int i=1;i<=n;i++){
	          if(n % i == 0){
	              System.out.println(i);
	              //fact=fact*i;
	              //sum =sum+i;
	              sum =sum+i;
	          }
	      }
	      System.out.println("Sum of Factors: "+sum);
	  }
}