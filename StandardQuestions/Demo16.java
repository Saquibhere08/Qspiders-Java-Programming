package standard;
import java.util.Scanner;
//Q16.WAJP to Print Prime Numbers Range from M to N
public class Demo16 {
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Set Ranges to Print Prime Numbers");
        System.out.print("m: ");
        int m=sc.nextInt();
        System.out.print("n: ");
        int n=sc.nextInt();

        for(int i=m;i<=n;i++){
            int count=0;
            for(int j=1;j<=n;j++)
                {
                if(i%j==0)
                    {
                        count++; 
                    }
                }
            if(count==2){
                System.out.println(i+" is a Prime Number.");
            }else
                {
                    System.out.println(i+" not a Prime Numeber.");
                }
        }




    }
   
}
