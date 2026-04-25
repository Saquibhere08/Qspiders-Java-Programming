package arrayList;
import java.util.Scanner;
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing Elements at Even Indices");
        System.out.println("Enter Size of the Array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the Array Elements of "+i+" is: ");
            nums[i]=sc.nextInt();

        }
        System.out.println("Even: ");

       for(int i=0;i<n;){

                System.out.println(i+" : "+nums[i]);
                i+=2;
            }
             
            
            System.out.println("ODD: ");

            for(int i=1;i<n;){
                
                System.out.println(i+" : "+nums[i]);
                i+=2;
                 
            }   
                       
        }
    }

