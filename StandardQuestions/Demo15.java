import java.util.Scanner;
//Q15. WAJP to find weather a number is prime or not?

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            if(num % i ==0){
                num++;
                if(num == 2  ){
                    System.out.println(num+ " is a Prime Number");
                }
                else{
                    System.out.println(num+" is not a Prime Number.");
                }
            }
        }

    }
}
