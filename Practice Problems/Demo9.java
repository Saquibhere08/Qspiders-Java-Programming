package PracticeQuestions;
import java.util.Scanner;
public class Demo9 {
    //WAJP to calculate the Greatest Common Divisor of 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the Value of b: ");
        int b=sc.nextInt();

        gcd(a,b);
    }

    public static void gcd(int x, int y){
        while(y!=0){
            int temp=y;
            y = x%y;
            x=temp;
        }
        System.out.println("GCD of two numbers: "+x);

    }
    
}
