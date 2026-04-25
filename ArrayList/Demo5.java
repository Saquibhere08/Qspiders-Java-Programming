package arrayList;

import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Array: ");
        for(int i=0;i<arr.length;i++){
            //System.out.println("Enter the Elements of Array: ");
            arr[i]=sc.nextInt();
            //System.out.println("arr["+i+"]: "+arr[i]);
            
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //System.out.println(Arrays.toString(arr)); //print the array in String Format
        System.out.println("Reverse of An Array: ");
        for(int j=n-1;j>=0;j--){

            System.out.print(arr[j]+" ");
        }
        //System.out.println(Arrays.toString(arr));

}
}
