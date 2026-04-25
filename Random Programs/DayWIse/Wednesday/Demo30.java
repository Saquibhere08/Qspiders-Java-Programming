package Friday;
import java.util.Scanner;
public class Demo30 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number: ");
        int digit=sc.nextInt();
        int num=1;
        while(num>0){
            int d=num/10;
            System.out.println(d);
            num=num/10;
        }

    }
}
//not completed
