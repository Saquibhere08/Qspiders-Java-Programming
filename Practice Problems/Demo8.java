package PracticeQuestions;
import java.util.Scanner;
public class Demo8 {
    public static void main(String[] args) {
        //WAJP 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x=sc.nextInt();
        System.out.println("Enter the Value of N: ");
        int n=sc.nextInt();

        checkPower(x,n); //calling the method
    }
    public static void checkPower(int x, int n){
        //using Math Class
        int res=(int)Math.pow(x, n); //Math.pow class returns the value in double.
        System.out.println("X^n= "+res);
    }
}
