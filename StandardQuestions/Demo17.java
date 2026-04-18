//WAJP to print the sum of Prime numbers with Ranges
package standard;
import java.util.Scanner;
public class Demo17 
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Set Ranges to Print Prime Numbers");
        System.out.print("m: ");
        int m=sc.nextInt();
        System.out.print("n: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            int count=0;
            
            for(int j=1;j<=i;j++)
                {
                    
                if(i%j==0)
                    {
                      count++; 
                    }
                }
            if(count==2){
                System.out.println(i+" is a Prime Number.");
                sum+=i;
               // System.out.println("Total Sum: "+sum);
                
            }
            
            }
            System.out.println("Total Sum: "+sum);
        }
    }




       

