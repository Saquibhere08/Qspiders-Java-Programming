/*
GCD(Greatest Common Divisor)
12-> 1,2,3,4,6,12
28 -> 1,2,4,7,14,28
*/
//Demo28
package Friday;
import java.util.Scanner;
public class DemoGcd
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int gcd=0;
        System.out.print("Enter the Value of a: ");
        int a =sc.nextInt();
        System.out.print("Enter the Value of b: ");
        int b =sc.nextInt();

        for(int i=1;i<=a && i<=b; i++){
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd);

    }    
}


//Q28. WAJP to print the GCD (Greatest Common Dvisor)