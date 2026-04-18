package standard;

import java.util.Scanner;

//WAJP to print sum of odd numbers in range.
public class Demo6 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Provide Ranges: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;

        for(int i=n;i<=m;i++){
            if(i%2!=0){
                System.out.println("ODD Numbers: "+i);
                sum=sum+i;
                System.out.println("Sum of ODD Numbers: "+sum);
            }
        }
    }
}
