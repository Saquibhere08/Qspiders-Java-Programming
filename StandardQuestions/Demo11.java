package standard;

//Q11.WAJP to print factor of n.
import java.util.Scanner;
class Demo11{
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Number(for factorial n): ");
      int n=sc.nextInt();
      int fact=0;
      for(int i=1;i<=n;i++){
          if(n % i == 0){
              System.out.println(i);
              fact=fact*i;

          }
      }
  }
}