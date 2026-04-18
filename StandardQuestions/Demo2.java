//WAJP to print ODD number Ranges
package standard;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Even Number with Ranges ");
        System.out.println("Set Range: ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            if(i%2 != 0){
                System.out.println(i+" is a ODD Number.");
            }
        }
	}
}

