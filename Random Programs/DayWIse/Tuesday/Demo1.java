package Tuesday;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] arg){
        //Using Method
        //WAJP to print from 1 to n.
        System.out.println("Printing 1- n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        display(n);
    }

    public static void display(int n){
        for (int i=1;i<=n;i++){
            System.out.println(i);

        }
    }
}
