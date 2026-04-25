package arrayList;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int sum=0;
        //elements into an array
        for(int i=0;i<n;i++){
            System.out.println("Enter the array Elements: ");
            arr[i]=sc.nextInt();
            sum+=arr[i];//adding of the array elements

        }  
        System.out.println("Sum: "+sum);      


        
       
        
        
    }

}
