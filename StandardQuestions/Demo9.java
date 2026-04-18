package standard;
//WAJP to generate a multiplication table of any number.
import java.util.Scanner;
public class Demo9 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("================Multiplication Table==============");
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int mul=0;
        for(int i=1;i<=10;i++){
            mul=n*i;
            System.out.println(n+" * "+i+" = "+ " "+mul );
        }

    }
}
