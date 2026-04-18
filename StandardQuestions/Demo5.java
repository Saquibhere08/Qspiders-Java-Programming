package standard;

import java.util.Scanner;

//WAJP to find sum of even numbers in a range.
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Provide Ranges: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;

        for(int i=n;i<=m;i++){
            if(i%2==0){
                System.out.println("Even Numbers: "+i);
                sum=sum+i;
                System.out.println("Sum of Even Numbers: "+sum);
            }
        }
    }
}
