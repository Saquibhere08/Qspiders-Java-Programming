package Tuesday;
import java.util.Scanner;
public class Demo2 {
    public static void display(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            System.out.println(i);
            System.out.println("Sum: "+sum);
        }
    }

    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Value of N: ");
        int n=sc.nextInt();
        display(n);
    }
}
